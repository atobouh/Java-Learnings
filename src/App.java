public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    Inventory inventory = new Inventory(); // Create an instance of the Inventory class 

    Items item1 = new Items("Apple", 10); // Create an instance of the Items class
    Items item2 = new Items("Banana", 20); // Create another instance of the Items class

    inventory.AddItem(item1); // Add item1 to the inventory
    inventory.AddItem(item2); // Add item2 to the inventory

    inventory.displayItems(); // Display the items in the inventory
}


