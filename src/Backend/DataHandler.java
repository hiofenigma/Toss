/**
 * static class DataHandler.
 * Works with the data being saved about clients (and..?)
 * why: can be reached from within the listener and from other classes.
 * 
 * @author Stian Johansen
 * @author Anders Skaalsveen
 * @author Runar J¿rgensen
 */
package Backend;

public class DataHandler {
/*Connection to DB/xml*/
/*
 * @Deprecated
 */
public void removeFromuserList() {
    /*Remove device*/
}

/*
 * @Deprecated
 */
public void cleanUpUserList(){
	/*Remove clients that havent been recorded the last x minutes
	 * - Should be run in intervals 
	 */
}

/*
 * 
 */
public void addTouserList(Device device) {
    /*Add device if not already existing. if existing, update timestamp*/
}

		
}
