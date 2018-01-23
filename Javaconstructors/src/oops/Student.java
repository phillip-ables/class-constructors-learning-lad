package oops;

/**
 *
 * @author user
 */
public class Student {
    //class properties
    String name;
    int age;
    
    //access specifier
    public Student(){
        System.out.println("Constructor with no parameters called");
    }
    
    //class methods
    public void introduce(){
        System.out.println("name is " + name + " and age is " + age);
    }
}
