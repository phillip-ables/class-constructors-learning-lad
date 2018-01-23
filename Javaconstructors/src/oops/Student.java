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
    
    public Student(String iname){
        System.out.println("Constructor with one String parameter called");
        name = iname;
        age = 1;
    }
    
    public Student(int iage){
        System.out.println("Constructor with one integer parameter called");
        age = iage;
    }
    
    //class methods
    public void introduce(){
        System.out.println("name is " + name + " and age is " + age);
    }
}
