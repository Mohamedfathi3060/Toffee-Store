import java.util.ArrayList;

public class Shopping_Cart {
    private ArrayList<Item> items;
    private double totalPrice;
    public double calculateTotal() {
        double result = 0;
        for (Item item:
             items) {
            result += item.getPrice();
        }
        return result;
    }

    public boolean addItem(Item item) {
        if (item.isAvailable()){
            items.add(item);
            return true;
        }
        return false;
    }

}
