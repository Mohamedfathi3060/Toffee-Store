import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class LoggedInUser implements User {
    private String UserID;
    private String UserName;
    private String Password;
    private String Address;
    private String PhoneNumber;
    private String Email;
    private Shopping_Cart Cart;
    private ArrayList<Order> Orders;
    public LoggedInUser (){
        Cart = new Shopping_Cart();
        Orders = new ArrayList<>();
    }
    public void SetUserID(String ID)
    {
        UserID = ID;
    }
    public void SetUserName(String Name)
    {
        UserName = Name;
    }
    public void SetPassword(String Pass)
    {
        Password = Pass;
    }
    public void SetAddress(String address)
    {
        Address = address;
    }
    public void SetPhoneNumber(String Number)
    {
        PhoneNumber = Number;
    }
    public void SetEmail(String mail)
    {
        Email = mail;
    }

    public String getUserID()
    {
        return UserID;
    }
    public String getPassword()
    {
        return Password;
    }
    public String getEmail()
    {
        return Email;
    }
    public String getPhoneNumber()
    {
        return PhoneNumber;
    }
    public boolean addItem (Item item, int quantity) {
        return  Cart.addItem(item,quantity) ? true : false;
    }
    public void printPrevOrders (){
        if (Orders.isEmpty()){
            System.out.println("No Previous Orders");
        }
        else {
            for (int i = 0; i < Orders.size(); i++){
                Orders.get(i).printOrderDetails();
            }
        }
    }
    public boolean checkOut (){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Pay Method to Continue: ");
        System.out.println("1-Cash ");
        String ans = input.nextLine();
        if (ans == "1" || ans.toLowerCase(Locale.ROOT) == "cash") {
            Pay_Method payMethod = new Cash_Method();
            Order order = new Order(Cart, UserID, payMethod,Address);
            Orders.add(order);
            return true;
        }
        else {
            System.out.println("Sorry This Method Not Available Now");
        }
        return false;
    }
    public boolean checkOutPrevOrder (int ID){
        for (int i = 0; i < Orders.size(); i++){
            if (Orders.get(i).getOrderID() == ID){
                Scanner input = new Scanner(System.in);
                System.out.println("Choose Pay Method to Continue: ");
                System.out.println("1-Cash ");
                String ans = input.nextLine();
                if (ans == "1" || ans.toLowerCase(Locale.ROOT) == "cash") {
                    Order order = Orders.get(i);
                    Orders.add(order);
                    return true;
                }
                else {
                    System.out.println("Sorry This Method Not Available Now");
                }
            }
        }
        return false;
    }

}
