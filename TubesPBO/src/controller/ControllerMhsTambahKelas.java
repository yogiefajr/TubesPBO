/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tubespbo.Aplikasi;
import tubespbo.Kelas;
import tubespbo.Mahasiswa;
import view.ViewMhsHome;
import view.ViewMhsTambahKelas;

/**
 *
 * @author tinodau
 */
public class ControllerMhsTambahKelas implements ActionListener{
    private Aplikasi apps;
    private ViewMhsTambahKelas view;
    

    public ControllerMhsTambahKelas() {
        apps = new Aplikasi();
        view = new ViewMhsTambahKelas();
        view.setVisible(true);
        view.addListener(this);
        
        view.inputData(apps.getFileKelas());
        
        for (int i = 0; i < apps.getFileKelas().size(); i++) {
            view.setComboKelas(apps.getFileKelas().get(i).getKelasnya());
        }
        
    }
    
    public boolean cekKelas(String Kelasnya) {
        for (int i = 0; i < ViewMhsHome.getMahasiswa().getKelasSemua().size(); i++) {
            if (ViewMhsHome.getMahasiswa().getKelasSemua().get(i).getKelasnya().equals(Kelasnya)) {
                return false;
            }
        }
        return true;
    }
    
    public int getIdxMahasiswa(Mahasiswa mhs) {
        for (int i = 0; i < apps.getFileMahasiswa().size(); i++) {
            if (apps.getFileMahasiswa().get(i).getUsername().equals(mhs.getUsername())) {
                return i;
            }
        }
        return 0;
    }
    
    public Kelas getKelas(String Kelasnya ) {
        for (int i = 0; i < apps.getFileKelas().size(); i++) {
            if (apps.getFileKelas().get(i).getKelasnya().equals(Kelasnya)) {
                return apps.getFileKelas().get(i);
            }
        }
        return null;
    }



    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(view.getBtnTambah())) {
            try {
                if (cekKelas(view.getComboKelas()) == true) {
                    ArrayList<Mahasiswa> mhs = apps.getFileMahasiswa();
                    mhs.get(getIdxMahasiswa(ViewMhsHome.getMahasiswa())).addKelas(getKelas(view.getComboKelas()));
                    apps.saveFileMahasiswa(mhs);
                    Mahasiswa m = apps.getFileMahasiswa().get(getIdxMahasiswa(ViewMhsHome.getMahasiswa()));
                    ViewMhsHome.addMahasiswa(m);
                    ViewMhsHome home = new ViewMhsHome();
                    home.inputData(ViewMhsHome.getMahasiswa().getKelasSemua());
                    JOptionPane.showMessageDialog(null, "Penambahan Kelas Sukses");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Sudah Diambil!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Belum di ambil");
            }
        }
        else if (source.equals(view.getBtnKembali())) {
            ControllerMhsHome home = new ControllerMhsHome();
            view.dispose();
        }
    }
}
