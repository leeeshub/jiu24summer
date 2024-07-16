package day2.period3;

public class Electronics extends Product {
    private String brand;
    private int warranty;

    public Electronics(String name, double price, String brand, int warranty) {
        super(name, price);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public String getInfo() {
        return getName() + " (Electronics) - " + brand + ": $" + getPrice() + ", Warranty: " + warranty + " years";
    }
}
