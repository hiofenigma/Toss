/**
 * class NetworkCommunicator
 * @author Stian Johansen
 * @author Anders Skaalsveen
 * @author Runar Jørgensen
 */

import java.lang.Thread;

public class NetworkCommunicator extends Thread {
Scanner scanner;
Broadcaster broadcaster;
int broadcastTimeout;
/**
  * Constructor for NetworkCommunicator
  * 
  */
    public NetworkCommunicator(int broadcastTimeout) {
        scanner     = new Scanner();
        broadcaster = new Broadcaster();
        this.broadcastTimeout = broadcastTimeout;

    }
    /*
     * @Deprecated
     */ 

    public void run(){
        /*Do the magic; */
        while(true){
            broadcaster.sendBeacon();
            /*<Sleep>*/
            
        }
            
    
    }
    
}
