package day2.period3;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // method to override
    public String getInfo() {
        return name + ": $" + price;
    }
}
