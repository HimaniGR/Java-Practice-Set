public class ProductInventory {

    public static void main(String[] args) {

        Electronics[] inventory = {
                new Electronics("Laptop", 1000),
                new Electronics("Phone", 500),
                new Electronics("Tablet", 300)
        };

        for(Electronics e : inventory) {
            e.applyDiscount(10);
        }
    }
}