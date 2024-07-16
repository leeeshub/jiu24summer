package day2.period3;

public class Groceries extends Product {
    private String expirationDate;

    public Groceries(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getInfo() {
        return getName() + " (Groceries): $" + getPrice() + ", Expires on: " + expirationDate;
    }
}
