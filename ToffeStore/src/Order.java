import java.util.ArrayList;

public class Order {
    private Shopping_Cart Cart;
    private  static int lastOrderID = 0;
    private  int orderID;
    private String userID;
    private double totalPrice;
    private Pay_Method payMethod;
    private String Address;

    // construct an order object with the items in specific cart and a user information
    public Order(Shopping_Cart cart, String userID, Pay_Method payMethod, String Address){
        this.Cart = cart;
        this.totalPrice = cart.calculateTotal();
        this.userID = userID;
        this.payMethod = payMethod;
        this.Address = Address;
        this.orderID = lastOrderID + 1;
        lastOrderID++;
        payMethod.Redeem();
        System.out.println("Order " + orderID + " will arrive within 2 working days");
    }
    // prints order information
    public void printOrderDetails() {
        System.out.println("OrderID: " + orderID);
        for (int i = 0; i < Cart.getItems().size(); i++){
            System.out.println("Item Name: " + Cart.getItems().get(i).getName() + " Quantity: " + Cart.getItemsQuantity().get(i)
                                + " Price: " + Math.round(Cart.getItemsQuantity().get(i) * Cart.getItems().get(i).getPrice() * 100.0)/100.0);
        }
        System.out.println("Total Price: " + totalPrice);
        System.out.println("UserID: " + userID);
        System.out.println("PaymentMethod: " + payMethod.getMethodName());
        System.out.println("Address: " + Address);
    }
    // returns order id
    public int getOrderID () {
        return orderID;
    }
}
