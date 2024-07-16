package day3.period1;

public class MountainBike extends Bicycle {
    private int suspensionLevel;

    public MountainBike(String type) {
        super(type);
        this.suspensionLevel = 5; // Default suspension level
    }

    public void adjustSuspension(int level) {
        suspensionLevel = level;
        System.out.println(getType() + " bicycle is adjusting its suspension to level " + suspensionLevel + ".");
    }

    private String getType() {
        return getClass().getSimpleName();
    }
}
