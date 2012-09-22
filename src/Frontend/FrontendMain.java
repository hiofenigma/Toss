/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.*;
/**
 *
 * @author Stian Johansen
 */
public class FrontendMain {
    public static void main(String[] args) {
    	System.out.printf("Hello");

    	Device thisDevice = new Device("A MAC-address");
    	Broadcaster test = new Broadcaster(thisDevice);
    	test.sendBeacon();
    	
    	
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new discoveryWindow().setVisible(true);
            }
        });

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //new fileTransferWindow().setVisible(true);
            }
        });

    }
}
