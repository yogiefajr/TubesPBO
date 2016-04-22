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
import tubespbo.Mahasiswa;
import view.ViewMhsHapusKelas;
import view.ViewMhsHome;

/**
 *
 * @author tinodau
 */
public class ControllerMhsHapusKelas implements ActionListener{
    private Aplikasi apps;
    private ViewMhsHapusKelas view;
    
    public ControllerMhsHapusKelas() {
        apps = new Aplikasi();
        view = new ViewMhsHapusKelas();
        view.setVisible(true);
        view.addListener(this);
        
        
        view.inputData(apps.getFileMahasiswa().get(getIdx(ViewMhsHome.getMahasiswa())).getKelasSemua());
        
        for (int i = 0; i < ViewMhsHome.getMahasiswa().getKelasSemua().size(); i++) {
            view.setComboKelas(ViewMhsHome.getMahasiswa().getKelasSemua().get(i).getKelasnya());
        }
    }
    
    public int getIdx(Mahasiswa mhs) {
        for (int i = 0; i < apps.getFileMahasiswa().size(); i++) {
            if (apps.getFileMahasiswa().get(i).getUsername().equals(mhs.getUsername())) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source.equals(view.getBtnKembali())) {
            ControllerMhsHome home = new ControllerMhsHome();
            view.dispose();
        } else if(source.equals(view.getBtnHapus())) {
            int index = getIdx(ViewMhsHome.getMahasiswa());
            if (ViewMhsHome.getMahasiswa().getKelasSemua()!=null) {
                try {
                    ArrayList<Mahasiswa> mhs = apps.getFileMahasiswa();
                    mhs.get(index).removeKelas(view.getComboKelas());
                    apps.saveFileMahasiswa(mhs);
                    JOptionPane.showMessageDialog(null, "Penghapusan Kelas Berhasil");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Kelas Belum Dipilih");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Kelas Kosong");
            }
        }
    }

}
