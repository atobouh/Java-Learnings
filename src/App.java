public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Inventory inventory = new Inventory();

      //  Items item1 = new Items("Apple", 10);
      //  Items item2 = new Items("Banana", 20);
        Fruits Fruit = new Fruits("Mango", 15, "Tropical");
        Weapon weapon1 = new Weapon("Sword", 5, "Melee", 50);
        String greetings = "Fuck The Mondays";

       // inventory.addItem(item1);
       // inventory.addItem(item2);
        inventory.addItem(Fruit);
        inventory.addItem(weapon1);

        inventory.displayItems();
        System.out.println(greetings.length());
        System.out.println(add(greetings.length(),4));
        
    }
    public static int add(int a,int n){
        return a+n;
    }
    public static double ratio(double n, double m){
        return (double) n/(n+m);
    }
}