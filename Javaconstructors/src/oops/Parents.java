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
        mom = "ghost";
        missedCalls = 0;
    }
    
    public Parents(int iNum){
        System.out.println("Constructor with integer parameter called");
        missedCalls = iNum;
        mom = "Joann"; 
    }
    
    public void momsCalling(){
        System.out.println("Your Mother " + mom + " has called " + missedCalls + " times");
    }
}
