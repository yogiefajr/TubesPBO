/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author tinodau
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tubespbo.Aplikasi;
import tubespbo.Mahasiswa;
import view.ViewMhsHome;


public class ControllerMhsHome implements ActionListener{
    private Aplikasi aplikasi;
    private ViewMhsHome view;
    
    
    public ControllerMhsHome(){
        aplikasi = new Aplikasi();
        view = new ViewMhsHome();
        view.setVisible(true);
        view.addListener(this);
        
        view.inputData(getNewMhs(ViewMhsHome.getMahasiswa()).getKelasSemua());
        
        String semester = Integer.toString(view.getMahasiswa().getSemester());
        view.setTextNim(view.getMahasiswa().getId());
        view.setTextNama(view.getMahasiswa().getNama());
        view.setTextSemester(semester);
        
    }
    
    public Mahasiswa getNewMhs(Mahasiswa m) {
        for (int i = 0; i < aplikasi.getFileMahasiswa().size(); i++) {
            if (aplikasi.getFileMahasiswa().get(i).getUsername().equals(m.getUsername())) {
                return aplikasi.getFileMahasiswa().get(i);
            }
        }
        return null;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (source.equals(view.getBtnTambahKelas())) {
            ControllerMhsTambahKelas tambah = new ControllerMhsTambahKelas();
            view.dispose();
        }
        else if (source.equals(view.getBtnHapusKelas())) {
            ControllerMhsTambahKelas hapus = new ControllerMhsTambahKelas();
            view.dispose();
        }
        else if (source.equals(view.getBtnKeluar())) {
            ControllerLoginMahasiswa login = new ControllerLoginMahasiswa();
            view.dispose();
        } 
    }

}
