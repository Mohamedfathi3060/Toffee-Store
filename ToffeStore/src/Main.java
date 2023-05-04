//for classes
/*
public => seen  y all classes
default => class seen by only files in its same package

final    => class can be a super class {not allowed to br inhertidet}
abstract => The class cannot be used to create objects {may has impl. for some methods}


For attributes and methods, you can use the one of the following:


final	Attributes and methods cannot be overridden/modified
static	Attributes and methods belongs to the class, rather than an object
abstract	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
transient	Attributes and methods are skipped when serializing the object containing them
synchronized	Methods can only be accessed by one thread at a time
volatile	The value of an attribute is not cached thread-locally, and is always read from the "main memory"




*/

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");



    }
}