import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items;
    private  static String lastOrderID;
    private  String orderID;
    private String userID;
    private double totalPrice;
    private Pay_Method payMethod;
    private String Address;
    public Order(ArrayList<Item> items, String userID, Pay_Method payMethod, String Address){
        this.items = items;
        this.userID = userID;
        this.payMethod = payMethod;
        this.Address = Address;
        this.orderID = lastOrderID + 1;
    }
}
