public class Item {
    private String itemID;
    private String name ;
    private String category;
    private double price;
    private boolean available;

    public Item(String ID , String NAME , String CATEGORY , double PRICE, boolean AVA){
        this.itemID = ID;
        this.name = NAME ;
        this.category = CATEGORY ;
        this.price  = PRICE;
        this.available = AVA;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getItemID() {
        return itemID;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
