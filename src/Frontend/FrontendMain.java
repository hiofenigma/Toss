/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

/**
 *
 * @author stian
 */
public class FrontendMain {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new discoveryWindow().setVisible(true);
            }
        });

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new fileTransferWindow().setVisible(true);
            }
        });

    }
}
