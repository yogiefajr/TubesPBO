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
import view.ViewLoginAdmin;
import view.ViewAdminHome;
import view.ViewLoginHome;
/**
 *
 * @author tinodau
 */
public class ControllerLoginAdmin implements ActionListener{
    private ViewLoginAdmin view;
    private Aplikasi apps;

    public ControllerLoginAdmin() { 
        view = new ViewLoginAdmin();
        apps = new Aplikasi();
        view.setVisible(true);
        view.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(view.getBtnLogin())) {
            if ((apps.getFileAdmin().getUserAdmin().equals(view.getUsername())) && 
                    (apps.getFileAdmin().getPassAdmin().equals(view.getPassword())) == true) {
                ControllerAdminHome home = new ControllerAdminHome();
                view.dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "Username atau Password salah");
                //  JOptionPane.showMessageDialog(view, "Username atau Password salah");
            }
        }
        
        else if (source.equals(view.getBtnBack())) {
            ControllerLoginHome home = new ControllerLoginHome();
            view.dispose();
        }
    }
}

