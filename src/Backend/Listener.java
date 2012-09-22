/**
 * class Listener
 * Runs forever, triggers when a beacon from another device is discovered
 * - then executes the add-method in DataHandler.
 * @author Stian Johansen
 * @author Anders Skaalsveen
 * @author Runar J�rgensen
 */
package Backend;

import javax.activation.DataHandler;

public class Listener extends Thread{
	public Listener(){
		
	}

	public void run(){
		/*Continuously listen for (new) devices.*/
	}
	/*
	 * @Deprecated
	 */
	private boolean deviceDetected(){
		/*Execute DataHandler.addTouserList()
		 * even if the device is registered,
		 * what to do with the info is DataHandlers problem
		 * */
		return false;
	}
}
