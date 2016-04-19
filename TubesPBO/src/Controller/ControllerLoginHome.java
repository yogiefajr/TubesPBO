/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static jdk.nashorn.internal.objects.NativeRegExp.source;
import view.ViewLoginHome;

/**
 *
 * @author Yogie fajar
 */
public class ControllerLoginHome implements ActionListener{
    private ViewLoginHome view;

    public ControllerLoginHome() {
        view = new ViewLoginHome();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
    }
    
    
}   
