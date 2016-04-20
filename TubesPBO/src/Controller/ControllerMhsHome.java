/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
    private Aplikasi apli;
    private ViewMhsHome view;
    
    
    public ControllerMhsHome(){
        apli = new Aplikasi();
        view = new ViewMhsHome();
        view.setVisible(true);
        
        
    }
    
    public Mahasiswa getNewMhs(Mahasiswa m) {
        for (int i = 0; i < apli.getFileMahasiswa().size(); i++) {
            if (apli.getFileMahasiswa().get(i).getUsername().equals(m.getUsername())) {
                return apli.getFileMahasiswa().get(i);
            }
        }
        return null;
    }
    
    /*@Override
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
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
