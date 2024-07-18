package day2.period1;

public class MountainBike extends Bicycle {
    private String suspensionType;

    public MountainBike(String brand, int year, int gearCount, String suspensionType) {
        super(brand, year, gearCount);
        this.suspensionType = suspensionType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Suspension Type: " + suspensionType);
    }

    // Overloaded method
    public void displayInfo(String additionalInfo, boolean isOffroad) {
        displayInfo(additionalInfo);
        if (isOffroad) {
            System.out.println("Suitable for offroad.");
        } else {
            System.out.println("Not suitable for offroad.");
        }
    }

    // Getters and Setters
    public String getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }
}
