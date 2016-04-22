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
import tubespbo.Matakuliah;
import view.ViewAdminTambahMataKuliah;

/**
 *
 * @author tinodau
 */
public class ControllerAdminTambahMataKuliah implements ActionListener{
    private Aplikasi apps;
    private ViewAdminTambahMataKuliah view;
    
    public ControllerAdminTambahMataKuliah() {
        apps = new Aplikasi();
        view = new ViewAdminTambahMataKuliah();
        view.setVisible(true);
        view.addListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(view.getBtnTambah())) {
            if (apps.isSameMK(view.getMK()) == false) {
                Matakuliah matkul = new Matakuliah();
                matkul.setNamaMK(view.getMK());
                apps.simpanMK(apps.addMK(matkul));
                JOptionPane.showMessageDialog(null, "Penambahan Matakuliah berhasil");
            }
            else {
                JOptionPane.showMessageDialog(null, "Matakuliah sudah ada!");
            }
        }
        
        else if (source.equals(view.getBtnKembali())) {
            ControllerAdminHome home = new ControllerAdminHome();
            view.dispose();
        }
    }
}
