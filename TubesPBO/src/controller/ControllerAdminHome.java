/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tubespbo.Aplikasi;
import view.ViewAdminHome;

/**
 *
 * @author tinodau
 */
public class ControllerAdminHome implements ActionListener{
    private Aplikasi apps;
    private ViewAdminHome view;
    
    public ControllerAdminHome() {
        view = new ViewAdminHome();
        apps = new Aplikasi();
        view.setVisible(true);
        view.addListener(this);
        
        view.inputData(apps.getFileKelas());
        
        view.setTextNip(apps.getFileAdmin().getId());
        view.setTextNama(apps.getFileAdmin().getNama());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        //tambah kelas
        if(source.equals(view.getBtnTambahKelas())) {
            ControllerAdminTambahKelas tka = new ControllerAdminTambahKelas();
            view.dispose();
        
        //tambah matakuliah
        } else if(source.equals(view.getBtnTambahMK())) {
            ControllerAdminTambahMataKuliah tmka = new ControllerAdminTambahMataKuliah();
            view.dispose();
            
        //hapus kelas
        } else if(source.equals(view.getBtnHapusKelas())) {
            ControllerAdminHapusKelas hk = new ControllerAdminHapusKelas();
            view.dispose();
            
            
        //tambah dosen kelas
        } else if(source.equals(view.getBtnTambahDosenKelas())) {
            ControllerAdminTambahDosenKelas tdk = new ControllerAdminTambahDosenKelas();
            view.dispose();
            
            
        //tambah matakuliah kelas
        } else if(source.equals(view.getBtnTambahMKKelas())) {
            ControllerAdminTambahMataKuliahKelas tmkk = new ControllerAdminTambahMataKuliahKelas();
            view.dispose();
            
        
        // Hapus dosen kelas
        } else if(source.equals(view.getBtnHapusDosenKelas())) {
            ControllerAdminHapusDosenKelas hdk = new ControllerAdminHapusDosenKelas();
            view.dispose();
            
        // exit program
        } else if(source.equals(view.getBtnKeluar())) {
            ControllerLoginAdmin cla = new ControllerLoginAdmin();
            view.dispose();
        }
    }
    
    
}
