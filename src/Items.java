public abstract class Items {
    private String name;
    private int quantity;

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
    public abstract String getDescription(); // Abstract method to be implemented by subclasses
}