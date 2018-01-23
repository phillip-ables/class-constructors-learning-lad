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
        name = "noname";
        age = 1;
    }
    
    //class methods
    public void introduce(){
        System.out.println("name is " + name + " and age is " + age);
    }
}
