package day2.period1;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, int year, int doorCount, int batteryCapacity) {
        super(brand, year, doorCount);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    // Overloaded method
    public void displayInfo(boolean includeWarranty, boolean includeChargingStation) {
        displayInfo(includeWarranty);
        if (includeChargingStation) {
            System.out.println("Charging station included.");
        } else {
            System.out.println("No charging station.");
        }
    }

    // Getters and Setters
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
