# class-constructors-learning-lad
follow along with an instructional video with learning lad

A constructor is a special method
  Has same name as the class name
  No return type

Called whenever we are going to create an object of the class

Constructors are a special type of method
When you define a method
  First we have to write the access specifier
    Access modifiers (or access specifiers) are keywords in object-oriented languages that set the accessibility of classes, methods, and other members.
    WHERE THE METHOD IS ACCESSIBLE

Next for the method we need to write the return type
Constructors are special methods with no return type
  Same as class name
  then parenthesis
  then curly braces

Just like the methods that can take parameters
these constructors can also take parameters

Between curly braces
  write statements that we are going to execute in this constructors

Create an object of this student class
Class name and the reference variable
equals new keyword
then the class name and a pair of parenthesis

THAT IS THE CALL TO THE CONSTRUCTOR


new keyword creates the object by calling the constructor of that class
returns that reference
that reference is stored in our variable

create new class Parents
to create an object of this Parents class
See line 28
  <!-- Create an object of this student class
  Class name and the reference variable
  equals new keyword
  then the class name and a pair of parenthesis -->

the class
with the class properties
then the class methods

by using these constructors we can initialize class properties while creating the objects

now we can see the difference in a method and a constructor
the method is going to have the return type
  any type of data returned by it
method name can be any we choose to give
constructor name should be the same as the class

now we can call those methods through the objects we constructed from out classes

user of constructor can initialize properties of objects while creating them
we have initialized the name and the age with that object
these constructors are used to initialize our properties

jsut like we can overload the methods
we can overload the constructor
  we can have constructors with the same name
  should differ in there signatures
    either by the number of parameter that they take
    or by the type of parameters they take
    or by both
<!-- Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different. It is similar to constructor overloading in Java, that allows a class to have more than one constructor having different argument lists. -->

Constructor same name as the one before
but the signature is going to be
the constructor takes a string parameter
