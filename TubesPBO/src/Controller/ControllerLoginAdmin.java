/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tubespbo.Aplikasi;
import view.ViewLoginAdmin;

/**
 *
 * @author tinodau
 */
public class ControllerLoginAdmin implements ActionListener{
    private ViewLoginAdmin view;
    private Aplikasi app;

    public ControllerLoginAdmin() { 
        view = new ViewLoginAdmin();
        app = new Aplikasi();
        view.setVisible(true);
        view.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (source.equals(view.getBtnLogin())) {
            if ((app.getFileAdmin().getUserAdmin().equals(view.getUsername())) && 
                    (app.getFileAdmin().getUserAdmin().equals(view.getPassword())) == true) {
                ControllerAdminHome home = new ControllerAdminHome();
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

