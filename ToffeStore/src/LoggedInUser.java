import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

/**
 * Class That Holds Logged-in User Information
 */
public class LoggedInUser implements User {
    private String UserID;
    private String UserName;
    private String Password;
    private String Address;
    private String PhoneNumber;
    private String Email;
    private Shopping_Cart Cart;
    private ArrayList<Order> Orders;

    /**
     * Assigns Memory Space to User Cart and Orders List
     */
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
    public String getUserName() {
        return UserName;
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

    /**
     * Adds Specific Item to User's Cart
     * @param item Item Object User Wants to Add to His Cart
     * @param quantity The Quantity of The Item He Wants to Buy
     * @return True if Item is Available False Either
     */
    public boolean addItem (Item item, int quantity) {
        return  Cart.addItem(item,quantity);
    }

    /**
     * Prints All User's Previous Orders
     */
    public void printPrevOrders (){
        if (Orders.isEmpty()){
            System.out.println("No Previous Orders");
        }
        else {
            for (int i = 0; i < Orders.size(); i++){
                Orders.get(i).printOrderDetails();
                System.out.println();
            }
        }
    }

    /**
     * Creates an Order Object with the Items in the User's Shopping Cart
     * @return True if He Chooses Cash Method False Either because They are not Available
     */
    public boolean checkOut (){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Pay Method to Continue: ");
        System.out.println("1- Cash on delivery ");
        System.out.println("2- PayPal         (not available) ");
        System.out.println("3- E-Wallet       (not available) ");
        System.out.println("4- Loyalty Points (not available) ");
        // take the payment method number
        String ans = input.nextLine();
        if (Objects.equals(ans, "1") || ans.equalsIgnoreCase("cash")) {
            // create payment method object
            Pay_Method payMethod = new Cash_Method();
            // create order object
            Order order = new Order(Cart, UserID, payMethod,Address);
            Orders.add(order);
            // clear the shopping cart
            Cart = new Shopping_Cart() ;
            return true;
        }
        else {
            System.out.println("Sorry This Method Not Available Now");
        }
        return false;
    }

    /**
     * Add a Previous Order to User's Orders List and Check it Out
     * @param ID OrderID User Wants to Re-Order
     * @return True if He Chooses Cash Method False Either because They are not Available
     */
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

    /**
     * Checks if the Cart is Empty or Not
     * @return True if User's Cart is Empty (Doesn't Have Items False Either
     */
    public boolean isCartEmpty(){
        return Cart.getItems().isEmpty();
    }

}
