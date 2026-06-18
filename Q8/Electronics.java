public class Electronics implements Discountable {

    private String name;
    private double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void applyDiscount(double pct) {

        price = price - (price * pct / 100);

        System.out.println(name + " New Price = " + price);
    }
}