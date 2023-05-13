import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Class That Holds Logged-in User Information
 * @author AbdelrahmanMohamed
 */
public class LoggedInUser implements User {
    private String UserID;
    private String UserName;
    private String Password;
    private String Address;
    private String PhoneNumber;
    private String Email;
    private ShoppingCart Cart;
    private ArrayList<Order> Orders;

    /**
     * Assigns Memory Space to User Cart and Orders List
     */
    public LoggedInUser (){
        Cart = new ShoppingCart();
        Orders = new ArrayList<>();
    }

    /**
     * Sets User ID to the Given ID
     * @param ID is the Entered ID
     */
    public void SetUserID(String ID)
    {
        UserID = ID;
    }
    /**
     * Sets UserName to the Given Name
     * @param Name is the Entered Name
     */
    public void SetUserName(String Name)
    {
        UserName = Name;
    }
    /**
     * Sets User Password to the Given Password
     * @param Pass is the Entered Password
     */
    public void SetPassword(String Pass)
    {
        Password = Pass;
    }
    /**
     * Sets User Address to the Given Address
     * @param address is the Entered Address
     */
    public void SetAddress(String address)
    {
        Address = address;
    }
    /**
     * Sets User Phone Number to the Given Phone Number
     * @param Number is the Entered Phone Number
     */
    public void SetPhoneNumber(String Number)
    {
        PhoneNumber = Number;
    }
    /**
     * Sets User Email to the Given Email
     * @param mail is the Entered Email
     */
    public void SetEmail(String mail)
    {
        Email = mail;
    }

    /**
     * Returns The UserName
     * @return UserName
     */
    public String getUserName() {
        return UserName;
    }
    /**
     * Returns The UserID
     * @return UserID
     */
    public String getUserID()
    {
        return UserID;
    }
    /**
     * Returns The UserPassword
     * @return UserPassword
     */
    public String getPassword()
    {
        return Password;
    }
    /**
     * Returns The User Email
     * @return User Email
     */
    public String getEmail()
    {
        return Email;
    }
    /**
     * Returns The User Phone Number
     * @return Phone Number
     */
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
            PayMethod payMethod = new Cash_Method();
            // create order object
            Order order = new Order(Cart, UserID, payMethod,Address);
            Orders.add(order);
            // clear the shopping cart
            Cart = new ShoppingCart() ;
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
                if (Objects.equals(ans, "1") || ans.equalsIgnoreCase("cash")) {
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
