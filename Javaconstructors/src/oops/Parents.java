package oops;

/**
 *
 * @author user
 */
public class Parents {
    String mom;
    int missedCalls;
    
    public Parents(){
        System.out.println("Constructor called with no parameters");
        
    }
    
    public void momsCalling(){
        System.out.println("Your Mother " + mom + " has called " + missedCalls + " times");
    }
}
