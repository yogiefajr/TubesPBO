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
import tubespbo.Dosen;
import tubespbo.Kelas;
import view.ViewAdminTambahDosenKelas;

/**
 *
 * @author tinodau
 */
public class ControllerAdminTambahDosenKelas implements ActionListener{
    private Aplikasi apps;
    private ViewAdminTambahDosenKelas view;
    
    public ControllerAdminTambahDosenKelas() {
        view = new ViewAdminTambahDosenKelas();
        apps = new Aplikasi();
        view.setVisible(true);
        view.addListener(this);
        
        for (int i = 0; i < apps.getFileDosen().size(); i++) {
            view.setComboDosen(apps.getFileDosen().get(i).getNama());
        }
        
        for (int i = 0; i < apps.getFileKelas().size(); i++) {
            if (apps.getFileKelas().get(i).getDosen() == null) {
                view.setComboKelas(apps.getFileKelas().get(i).getKelasnya());
            }
        }
    }
    
    public Dosen getDosen(String nama){
        for (int i = 0; i < apps.getFileDosen().size(); i++) {
            if (apps.getFileDosen().get(i).getNama().equals(nama)) {
                return apps.getFileDosen().get(i);
            }
        }
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        ArrayList<Kelas> kelas = apps.getFileKelas();

        if (source.equals(view.getBtnKembali())){
            ControllerAdminHome home = new ControllerAdminHome();
            view.dispose();
        }
        if (source.equals(view.getBtnTambah())) {
            for (int i = 0; i < kelas.size(); i++) {
                if (kelas.get(i).getKelasnya().equals(view.getComboKelas())){
                    kelas.get(i).setDosen(getDosen(view.getComboDosen()));
                    apps.simpanKelas(kelas);
                    JOptionPane.showMessageDialog(null, "Penambahan Dosen Berhasil!");
                }
                
            }
        view.dispose();
        new ControllerAdminHome();
        }
    }
}
