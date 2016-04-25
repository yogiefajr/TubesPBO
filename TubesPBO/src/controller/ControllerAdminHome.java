/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        if(source.equals(view.getBtnTambahKelas())) {
            ControllerAdminTambahKelas tambahKelasAdm = new ControllerAdminTambahKelas();
            view.dispose();
        } else if(source.equals(view.getBtnTambahMK())) {
            ControllerAdminTambahMataKuliah tambahMKAdm = new ControllerAdminTambahMataKuliah();
            view.dispose();
        } else if(source.equals(view.getBtnTambahDosenKelas())) {
            ControllerAdminTambahDosenKelas tambahDosenKelas = new ControllerAdminTambahDosenKelas();
            view.dispose();
        } else if(source.equals(view.getBtnTambahMKKelas())) {
            ControllerAdminTambahMataKuliahKelas tambahMKKelas = new ControllerAdminTambahMataKuliahKelas();
            view.dispose();
        } else if(source.equals(view.getBtnKeluar())) {
            ControllerLoginAdmin cla = new ControllerLoginAdmin();
            view.dispose();
        }
    }
    
    
}
