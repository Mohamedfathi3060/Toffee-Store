import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Shopping Cart Class That Holds The Items User Wants to Buy
 * @author AbdelrahmanMohamed
 */
public class Shopping_Cart {
    private ArrayList<Item> items;
    private ArrayList<Integer> itemsQuantity;
    private double totalPrice;

    /**
     * Assigns Memory Space to the Items and itemsQuantity List
     */
    public Shopping_Cart () {
        items = new ArrayList<>();
        itemsQuantity = new ArrayList<>();
        totalPrice = 0;
    }

    /**
     * Calculate the Total Price of the Items in the Cart
     * @return Total Price
     */
    public double calculateTotal() {
        for (int i = 0; i < items.size(); i++){
            totalPrice += items.get(i).getPrice() * itemsQuantity.get(i);
        }
        // to restrict the result to two digit after the fraction mark
        totalPrice = Math.round(totalPrice*100.0)/100.0;
        return totalPrice;
    }

    /**
     * Adds Specific Item to User's Cart
     * @param item Item Object User Wants to Add to His Cart
     * @param quantity The Quantity of The Item He Wants to Buy
     * @return True if Item is Available False Either
     */

    public boolean addItem(Item item, int quantity) {
        if (item.isAvailable()){
            items.add(item);
            itemsQuantity.add(quantity);
            return true;
        }
        System.out.println("Item Not Available");
        return false;
    }

    /**
     * Gets Cart Items List
     * @return Items List
     */
    public  ArrayList<Item> getItems (){
        return items;
    }

    /**
     * Gets Cart itemsQuantity List
     * @return itemsQuantity List
     */
    public ArrayList<Integer> getItemsQuantity () {return itemsQuantity;}

}
