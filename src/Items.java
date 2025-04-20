public class Items {
    private String name; // Name of the item
    private int quantity; // Quantity of the item
    
    // Constructor to initialize the item with a name and quantity
    public Items(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }
 
    public int getQuantity() {
        return quantity;
    }
}

