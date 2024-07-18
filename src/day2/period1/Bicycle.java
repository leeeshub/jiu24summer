package day2.period1;

public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle(String brand, int year, int gearCount) {
        super(brand, year);
        this.gearCount = gearCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gear Count: " + gearCount);
    }

    // Overloaded method
    public void displayInfo(String additionalInfo) {
        displayInfo();
        System.out.println(additionalInfo);
    }

    // Getters and Setters
    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }
}
