/**
 * class Device
 * This class represents a device on the network.
 * 
 * @author Stian Johansen
 * @author Anders Skaalsveen
 * @author Runar J¿rgensen
 */
package Backend;

public class Device {
    private String uniqueID;
    private String name;
    private int ip;
    private String macAddress;
    
    public String getuniqueID() {
        return uniqueID;
    }

    public String getname() {
        return name;
    }
    
    public int getip() {
        return ip;
    }
    
    public String getmacAddress() {
        return macAddress;
    }
    
    public void setmacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
    


    public void setip(int ip) {
        this.ip = ip;
    }
    

    public void setname(String name) {
        this.name = name;
    }
    
    
    public void setuniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
    
}
