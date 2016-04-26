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
import tubespbo.Matakuliah;
import view.ViewAdminTambahMataKuliahKelas;

/**
 *
 * @author tinodau
 */
public class ControllerAdminTambahMataKuliahKelas implements ActionListener{
    private Aplikasi apps;
    private ViewAdminTambahMataKuliahKelas view;
    
    public ControllerAdminTambahMataKuliahKelas() {
        view = new ViewAdminTambahMataKuliahKelas();
        apps = new Aplikasi();
        view.setVisible(true);
        view.addListener(this);
        
        for (int i = 0; i < apps.getFileKelas().size(); i++) {
            if (apps.getFileKelas().get(i).getMK() == null) {
                view.setIsiNamaKelas(apps.getFileKelas().get(i).getKelasnya());
            }
        }
        
        for (int i = 0; i < apps.getFileMK().size(); i++) {
            view.setIsiMatakuliah(apps.getFileMK().get(i).getMKnya());
        }
    }

    public boolean cekMK(ArrayList<Kelas> listKelas, String namaMatkul){
        for (int i = 0; i < listKelas.size(); i++) {
            if (listKelas.get(i).getMK()!= null){
                if (listKelas.get(i).getMK().getMKnya().equals(namaMatkul)){
                    return false;
                }
            }
            
        }
        return true;
    }
    
    
    public Matakuliah getMK(String MKnya){
        for (int i = 0; i < apps.getFileMK().size(); i++) {
            if (apps.getFileMK().get(i).getMKnya().equals(MKnya)) {
                return apps.getFileMK().get(i);
            }
        }
        return null;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        ArrayList<Kelas> arkls = apps.getFileKelas();
        
        if (source.equals(view.getBtnKembali())){
            ControllerAdminHome home = new ControllerAdminHome();
            view.dispose();
        }
        
        if (source.equals(view.getBtnTambah())) {
            if (cekMK(arkls, view.getIsiMatakuliah()) == true) {
                for (int i = 0; i < apps.getFileKelas().size(); i++) {
                    if (arkls.get(i).getKelasnya().equals(view.getIsiNamaKelas())){
                        arkls.get(i).setMK(getMK(view.getIsiMatakuliah()));
                        apps.simpanKelas(arkls);
                        JOptionPane.showMessageDialog(null, "Mata Kuliah Berhasil Ditambahkan!");
                    }
                
                }
                
            view.dispose();
            new ControllerAdminHome();
            } 
            else {
                JOptionPane.showMessageDialog(null, "Mata Kuliah Telah Diambil di Kelas Lain");
            }
        }
    }
}
