/*for classes

public => seen  y all classes
default => class seen by only files in its same package

final    => class can be a super class {not allowed to br incertitude}
abstract => The class cannot be used to create objects { it may have impl. for some methods}


For attributes and methods, you can use the one of the following:


final	Attributes and methods cannot be overridden/modified
static	Attributes and methods belongs to the class, rather than an object
abstract	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
transient	Attributes and methods are skipped when serializing the object containing them
synchronized	Methods can only be accessed by one thread at a time
volatile	The value of an attribute is not cached thread-locally, and is always read from the "main memory"

diff between int and Integer
and double and Double

int and double is primitive data types which is good for performance
but use Integer and Double
1-when you will not accept null value
2-in list  or arrayList that accept only Objects

if you take object of parent or interface type
we can access methods of child by using
((child)objName).methodName();
if(objName instanceof child) ((Student)objName).methodName(); more Safe


*/


import java.io.IOException;
/*
app password for me
hegdiltnilrfwkgi
*/
public class Main {
    public static void main(String[] args) throws IOException {
    StoreSystem x = new StoreSystem();
    x.start();
    }
}