/**
 * class Broadcaster
 * @author Stian Johansen
 * @author Anders Skaalsveen
 * @author Runar J¿rgensen
 */
package Backend;

public class Broadcaster {

    private Device thisDevice;


    /**
     * Constructor for Broadcaster
     */
    public Broadcaster(Device thisDevice){
        this.thisDevice = thisDevice;
    }

    /*
     * @Deprecated
     */ 

    public int sendBeacon(){
        /* send broadcast-message to network with the global class values
         * return 0 if success, 1/2/../n if error.
         *  Use a interface for the error-definitions?
         */
        return 0;
    }




}
