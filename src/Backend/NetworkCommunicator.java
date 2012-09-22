/**
 * class NetworkCommunicator
 * @author Stian Johansen
 * @author Anders Skaalsveen
 * @author Runar J�rgensen
 */
package Backend;

import java.lang.Thread;

public class NetworkCommunicator extends Thread {
	Listener listener;
	Broadcaster broadcaster;
	int broadcastTimeout;

	/**
	 * Constructor for NetworkCommunicator
	 * 
	 */
	public NetworkCommunicator(int broadcastTimeout) {
		/*listener is its own thread*/
		listener = new Listener();
		listener.start();
		/*broadcaster is triggered from this thread.*/
		//QQ: create it as its own thread for readability?
		broadcaster = new Broadcaster(new Device());
		this.broadcastTimeout = broadcastTimeout;

	}
	/*
	 * @Deprecated
	 */
	public void run() {
		/* Do the magic; */
		while (true) {
			broadcaster.sendBeacon();
			/* <do more and sleep> */
		}

	}

}
