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
import tubespbo.Mahasiswa;
import view.ViewLoginMahasiswa;
import view.ViewMhsHome;

/**
 *
 * @author tinodau
 */
public class ControllerLoginMahasiswa implements ActionListener {
    private Aplikasi app;
    private ViewLoginMahasiswa view;

    public ControllerLoginMahasiswa() {
        app = new Aplikasi();
        view = new ViewLoginMahasiswa();
        view.setVisible(true);
        view.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnLogin())) {
            if (app.isMahasiswa(view.getUsername(), view.getPassword()) == true) {
                Mahasiswa newMhs = app.getMahasiswa(view.getUsername(), view.getPassword());
                ViewMhsHome.addMahasiswa(newMhs);
                ControllerMhsHome home = new ControllerMhsHome();
                view.dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "Username atau Password salah");
            }
        }
        
        else if (source.equals(view.getBtnBack())) {
            ControllerLoginHome home = new ControllerLoginHome();
            view.dispose();
        }
    }
}
