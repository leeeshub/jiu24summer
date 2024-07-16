package day2.period3;

public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public String getInfo() {
        return getName() + " (Clothing) - Size: " + size + ", Material: " + material + ": $" + getPrice();
    }
}
