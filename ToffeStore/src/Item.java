/**
 * This class represents an item in a toffee Store.
 */
public class Item {
    /**
     * The unique identifier of this item.
     */
    private String itemID;

    /**
     * The name of this item.
     */
    private String name;

    /**
     * The category of this item.
     */
    private String category;

    /**
     * The price of this item.
     */
    private double price;

    /**
     * Whether  this item is available.
     */
    private boolean available;

    /**
     * Constructs a new Item object with the specified ID, name, category, price, and availability.
     *
     * @param ID The ID of the item.
     * @param name The name of the item.
     * @param category The category of the item.
     * @param price The price of the item.
     * @param available Whether the item is available.
     */
    public Item(String ID, String name, String category, double price, boolean available) {
        this.itemID = ID;
        this.name = name;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    /**
     * Gets the price of this item.
     *
     * @return The price of the item.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets whether this item is available.
     *
     * @return Whether the item is available.
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Gets the ID of this item.
     *
     * @return The ID of the item.
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Gets the category of this item.
     *
     * @return The category of the item.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Gets the name of this item.
     *
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets whether  this item is available.
     *
     * @param available Whether the item is available.
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Sets the ID of this item.
     *
     * @param itemID The ID of the item.
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    /**
     * Sets the category of this item.
     *
     * @param category The category of the item.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Sets the name of this item.
     *
     * @param name The name of the item.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the price of this item.
     *
     * @param price The price of the item.
     */
    public void setPrice(double price) {
        this.price = price;
    }

}

