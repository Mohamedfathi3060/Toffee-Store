import java.io.IOException;

/**
 * This class represents a management system for items.
 * @author Mohamed Ftahi
 */
public class ItemsManagement {
    /**
     * The stock of items.
     */
    private Stock storeStock;

    /**
     * Constructs a new ItemsManagement object with the specified stock.
     *
     * @param my The stock of items.
     */
    public ItemsManagement(Stock my) {
        storeStock = my;

    }

    /**
     * Constructs a new ItemsManagement object with a new stock.
     */
    public ItemsManagement() throws IOException {
        storeStock = new Stock();
    }

    /**
     * Gets the stock of items.
     *
     * @return The stock of items.
     */
    public Stock getStock() {
        return storeStock;
    }

    /**
     * Deletes the specified item from the stock.
     *
     * @param it The item to delete.
     * @return Whether the item was deleted successfully.
     */
    public boolean deleteItem(Item it) {
        return storeStock.items.remove(it);
    }

    /**
     * Deletes the item at the specified index from the stock.
     *
     * @param index The index of the item to delete.
     * @return The item that was deleted, or null if no item was deleted.
     */
    public Item deleteItem(int index) {
        if (index > 0 && index < storeStock.items.size()) {
            return storeStock.items.remove(index);
        } else {
            return null;
        }
    }

    /**
     * Displays a list of all the items in the stock.
     */
    public void viewItems() {
        for (Item it : storeStock.items) {
            viewCard(it);
        }
    }

    /**
     * Displays a card for the specified item.
     *
     * @param it The item to display a card for.
     */
    private void viewCard(Item it) {
        System.out.println("\nID : " + it.getItemID() + ", Name : " + it.getName() + ", Price" + it.getPrice());
        System.out.println("category : " + it.getCategory() + ", available : " + (it.isAvailable() ? "YES" : "NO") + "\n");
    }

}
