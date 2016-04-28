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
import view.ViewAdminHapusDosenKelas;


/**
 *
 * @author tinodau
 */
public class ControllerAdminHapusDosenKelas implements ActionListener{
    private Aplikasi apps;
    private ViewAdminHapusDosenKelas view;
    
    public ControllerAdminHapusDosenKelas() {
        view = new ViewAdminHapusDosenKelas();
        apps = new Aplikasi();
        view.setVisible(true);
        view.addListener(this);
        
        view.inputData(apps.getFileKelas());
        
        System.out.println("size dosen : "+apps.getFileDosen().size());
        if (apps.getFileKelas() != null) {
            for (int i = 0; i < apps.getFileKelas().size(); i++) {
                view.setComboKelas(apps.getFileKelas().get(i).getKelasnya());
            }
        } 
    }
    
    public int getIndexKelas(String namaKelas) {
        if (apps.getFileKelas() != null) {
            for (int i = 0; i < apps.getFileKelas().size(); i++) {
                if (apps.getFileKelas().get(i).getKelasnya().equals(namaKelas)) {
                    return i;
                }
            }
        }
        return -1;
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

        if (source.equals(view.getBtnKembali())){
            ControllerAdminHome home = new ControllerAdminHome();
            view.dispose();
        }
        if (source.equals(view.getBtnHapus())) {
            if (apps.getFileKelas() != null) {
                ArrayList<Kelas> kelas = apps.getFileKelas();
                kelas.get(getIndexKelas(view.getComboKelas())).setDosen(null);
                apps.simpanKelas(kelas);
                JOptionPane.showMessageDialog(null,"Dosen kelas berhasil dihapus!");
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Dosen kelas tidak berhasil dihapus");
            } 
            view.dispose();
            new ControllerAdminHome();
        }
        
        else if (source.equals(view.getBtnKembali())) {
            ControllerAdminHome home = new ControllerAdminHome();
            view.dispose();
        }
    }
}


