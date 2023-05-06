import java.util.ArrayList;

public class Order {
    private Shopping_Cart Cart;
    private  static int lastOrderID = 0;
    private  int orderID;
    private String userID;
    private double totalPrice;
    private Pay_Method payMethod;
    private String Address;
    public Order(Shopping_Cart cart, String userID, Pay_Method payMethod, String Address){
        this.Cart = cart;
        this.totalPrice = cart.calculateTotal();
        this.userID = userID;
        this.payMethod = payMethod;
        this.Address = Address;
        this.orderID = lastOrderID + 1;
        lastOrderID++;
        payMethod.Redeem();
        System.out.println("Order " + orderID + " Taken Successfully");
    }
    public void printOrderDetails() {
        System.out.println("Items: ");
        for (int i = 0; i < Cart.getItems().size(); i++){
            System.out.println("Item Name: " + Cart.getItems().get(i).getName() + " Quantity: " + Cart.getItemsQuantity().get(i)
                                + " Price: " + Math.round(Cart.getItemsQuantity().get(i) * Cart.getItems().get(i).getPrice() * 100.0)/100.0);
        }
        System.out.println("Total Price: " + totalPrice);
        System.out.println("UserID: " + userID);
        System.out.println("PaymentMethod: " + payMethod.getMethodName());
        System.out.println("Address: " + Address);
        System.out.println("OrderID: " + orderID);
    }
    public int getOrderID () {
        return orderID;
    }
    public ArrayList getItems () {
        return Cart.getItems();
    }
    public ArrayList getItemsQuantity () {
        return Cart.getItemsQuantity();
    }
}
