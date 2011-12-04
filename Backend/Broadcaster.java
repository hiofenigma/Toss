/**
 * class Broadcaster
 * @author Stian Johansen
 * @author Anders Skaalsveen
 * @author Runar Jørgensen
 */

    public class Broadcaster {
    
    private String uniqueID;
    private String name;
    private int ip;
    private String macAddress;


/**
  * Constructor for Broadcaster
  */
    public Broadcaster(String uniqueID,String name, int ip, String macAddress){
        this.uniqueID = uniqueID;
        this.name = name;
        this.ip = ip;
        this.macAddress = macAddress;
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
