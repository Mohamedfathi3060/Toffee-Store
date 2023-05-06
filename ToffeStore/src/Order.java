import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items;
    private  static String lastOrderID = "0";
    private  String orderID;
    private String userID;
    private double totalPrice;
    private Pay_Method payMethod;
    private String Address;
    public Order(Shopping_Cart cart, String userID, Pay_Method payMethod, String Address){
        this.items = cart.getItems();
        this.totalPrice = cart.calculateTotal();
        this.userID = userID;
        this.payMethod = payMethod;
        this.Address = Address;
        this.orderID = lastOrderID + "1";
    }
}
