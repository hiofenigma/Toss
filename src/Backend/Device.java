/**
 * class Device
 * This class represents a device on the network.
 * 
 * @author Stian Johansen
 * @author Anders Skaalsveen
 * @author Runar J�rgensen
 */
package Backend;

public class Device {
    private String uniqueID;
    private String name;
    private int ip;
    // A MAC address never changes, so it should be static and determined upon the construction of the device.
    final private String macAddress;
    
    public Device(String macAddress){
    	this.macAddress = macAddress;
    }
    
    public Device(String macAddress, String name){
    	this(macAddress);
    	this.name = name;
    }
    
    public Device(String macAddress, String name , int ip){
    	this(macAddress,name);
    	this.setip(ip);
    
    }
    
    public Device(String macAddress, String name, int ip, String uinqueID){
    	this(macAddress,name,ip);
    	this.setuniqueID(uniqueID);
    }
    
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
