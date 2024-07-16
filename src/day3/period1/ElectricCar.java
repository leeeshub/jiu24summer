package day3.period1;

public class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String model) {
        super(model);
        this.batteryLevel = 100;
    }

    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println(getModel() + " car is charging its battery to " + batteryLevel + "%.");
    }

    @Override
    public void move() {
        if (batteryLevel > 0) {
            super.move();
            batteryLevel -= 10; // Battery decreases as car moves
        } else {
            System.out.println(getModel() + " car cannot move. Battery is empty.");
        }
    }

    private String getModel() {
        return getClass().getSimpleName();
    }
}