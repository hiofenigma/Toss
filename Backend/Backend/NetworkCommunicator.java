/**
 * class NetworkCommunicator
 * @author Stian Johansen
 * @author Anders Skaalsveen
 * @author Runar J¿rgensen
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
		listener = new Listener();
		broadcaster = new Broadcaster();
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
