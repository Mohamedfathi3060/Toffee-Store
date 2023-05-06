import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items;
    private ArrayList<Integer> itemsQuantity;
    private  static int lastOrderID = 0;
    private  int orderID;
    private String userID;
    private double totalPrice;
    private Pay_Method payMethod;
    private String Address;
    public Order(Shopping_Cart cart, String userID, Pay_Method payMethod, String Address){
        this.items = cart.getItems();
        this.itemsQuantity = cart.getItemsQuantity();
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
        for (int i = 0; i < items.size(); i++){
            System.out.println("Item Name: " + items.get(i).getName() + " Quantity: " + itemsQuantity.get(i)
                                + " Price: " + Math.round(itemsQuantity.get(i) * items.get(i).getPrice()*100.0)/100.0);
        }
        System.out.println("Total Price: " + totalPrice);
        System.out.println("UserID: " + userID);
        System.out.println("PaymentMethod: " + payMethod.getMethodName());
        System.out.println("Address: " + Address);
        System.out.println("OrderID: " + orderID);
    }
}
