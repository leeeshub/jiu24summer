package day1.period3;

public class Car extends Vehicle {
    private int doorCount;

    public Car(String brand, int year, int doorCount) {
        super(brand, year);
        this.doorCount = doorCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Door Count: " + doorCount);
    }

    // Overloaded method
    public void displayInfo(boolean includeWarranty) {
        displayInfo();
        if (includeWarranty) {
            System.out.println("Warranty included.");
        } else {
            System.out.println("No warranty.");
        }
    }

    // Getters and Setters
    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
