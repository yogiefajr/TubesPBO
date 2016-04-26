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
import view.ViewAdminHapusKelas;
import view.ViewAdminTambahKelas;
import view.ViewMhsHome;

/**
 *
 * @author tinodau
 */
public class ControllerAdminHapusKelas implements ActionListener{
    private Aplikasi apps;
    private ViewAdminHapusKelas view;
    
    public ControllerAdminHapusKelas() {
        apps = new Aplikasi();
        view = new ViewAdminHapusKelas();
        view.setVisible(true);
        view.inputData(apps.getFileKelas());
        
        view.addListener(this);
        
        for (int i = 0; i < apps.getFileKelas().size(); i++) {
            view.setComboKelas(apps.getFileKelas().get(i).getKelasnya());
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(view.getBtnHapus())) {
            if (apps.isSameKelas(view.getComboKelas()) == true) {
                Kelas kls = new Kelas(view.getComboKelas());
                apps.simpanKelas(apps.removeKelasAdmin(kls));   
                JOptionPane.showMessageDialog(null, "Kelas berhasil dihapus!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Kelas Tidak Ada");
            }
        }
        
        else if (source.equals(view.getBtnKembali())) {
            ControllerAdminHome home = new ControllerAdminHome();
            view.dispose();
        }
    }
    
    
}
