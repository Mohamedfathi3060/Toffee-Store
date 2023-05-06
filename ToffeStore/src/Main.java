/*for classes

public => seen  y all classes
default => class seen by only files in its same package

final    => class can be a super class {not allowed to br inhertidet}
abstract => The class cannot be used to create objects { it may has impl. for some methods}


For attributes and methods, you can use the one of the following:


final	Attributes and methods cannot be overridden/modified
static	Attributes and methods belongs to the class, rather than an object
abstract	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
transient	Attributes and methods are skipped when serializing the object containing them
synchronized	Methods can only be accessed by one thread at a time
volatile	The value of an attribute is not cached thread-locally, and is always read from the "main memory"

diff between int and Integer
and double and Double

int and double is primative data types which is good for performance
but use Integer and Double
1-when you will not accept null value
2-in list  or arrayList that accept only Objects

if take object of parent or interface type
we can access methods of child by using
((child)objName).methodName();
if(objName instanceof child) ((Student)objName).methodName(); more Safe


*/



public class Main {
    public static void main(String[] args) {
//        Stock st = new Stock();
//        st.addItem(new Item("123" , "pepsi" , null , 1250.363 , true));
//        st.addItem(new Item("567" , "cola" , null , 25060 , true));
//        st.addItem(new Item("8910" , "chepsi" , null , 36520.5654 , true));
//        st.addItem(new Item("203040" , "loloa" , null , 45950 , true));
//        st.addItem(new Item("9999" , "dietFood" , null , 59620.32 , false));
//
//        ItemsManagement im = new ItemsManagement(st);
//        im.viewItems();
//        Shopping_Cart cart = new Shopping_Cart();
//        Item item = st.getItem("123");
//        Item item2 = st.getItem("567");
//        Item item3 = st.getItem("8910");
//        cart.addItem(item,10);
//        cart.addItem(item2,5);
//        cart.addItem(item3,5);
//        System.out.println(cart.calculateTotal());
//        Pay_Method payMethod = new Cash_Method();
//        Order order = new Order(cart,"121",payMethod,"1st of Egypt");
//        Order order2 = new Order(cart,"121",payMethod,"1st of Egypt");
//        order.printOrderDetails();
//        order2.printOrderDetails();

    StoreSystem x = new StoreSystem();
    x.mainManu();
    x.mainManu();



    }
}