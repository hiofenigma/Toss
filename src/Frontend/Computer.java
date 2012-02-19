/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import javax.swing.ImageIcon;

/**
 *
 * @author stian
 */
public class Computer extends javax.swing.JLabel{
    private ImageIcon icon;
    
    public Computer(){
        
        icon = new ImageIcon(getClass().getResource("/img/computer_large.png"));
        super.setIcon(icon);
        super.setSize(48, 48);
        super.updateUI();
    }
    
}
