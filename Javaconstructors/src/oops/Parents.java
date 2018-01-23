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
    
    //first ever if statement
    //first ever to caps statement
    //if call > x name in all caps
    public Parents(String iMum, int iNum){
        System.out.println("Constructor with 2 parameters called");
        mom = iMum;
        missedCalls = iNum;
        if (missedCalls > 3){
            mom = mom.toUpperCase();
        }
    }
    
    public void momsCalling(){
        System.out.println("Your Mother " + mom + " has called " + missedCalls + " times");
    }
}
