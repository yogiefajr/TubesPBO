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
import tubespbo.Kelas;
import view.ViewAdminTambahKelas;

/**
 *
 * @author tinodau
 */
public class ControllerAdminTambahKelas implements ActionListener{
    private Aplikasi apps;
    private ViewAdminTambahKelas view;
    
    public ControllerAdminTambahKelas() {
        apps = new Aplikasi();
        view = new ViewAdminTambahKelas();
        view.setVisible(true);
        view.AddListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(view.getBtnTambah())) {
            if (apps.isSameKelas(view.getNamaKelas()) == false) {
                Kelas kls = new Kelas(view.getNamaKelas());
                apps.simpanKelas(apps.addKelas(kls));
                JOptionPane.showMessageDialog(null,apps.getFileKelas().get(0).getKelasnya());
                JOptionPane.showMessageDialog(null, "Kelas berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Kelas sudah ada");
            }
        }
        
        else if (source.equals(view.getBtnKembali())) {
            ControllerAdminHome home = new ControllerAdminHome();
            view.dispose();
        }
    }
}
