package day1.period3;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic", 2020);
        vehicle.setPrice(15000);
        vehicle.displayInfo();
        System.out.println();

        Bicycle bicycle = new Bicycle("Giant", 2021, 21);
        bicycle.setPrice(500);
        bicycle.displayInfo();
        System.out.println();
        bicycle.displayInfo("Great for commuting.");
        System.out.println();

        MountainBike mountainBike = new MountainBike("Trek", 2022, 18, "Full");
        mountainBike.setPrice(1000);
        mountainBike.displayInfo();
        System.out.println();
        mountainBike.displayInfo("Perfect for trails.", true);
        System.out.println();

        Car car = new Car("Toyota", 2023, 4);
        car.setPrice(25000);
        car.displayInfo();
        System.out.println();
        car.displayInfo(true);
        System.out.println();

        ElectricCar electricCar = new ElectricCar("Tesla", 2024, 4, 75);
        electricCar.setPrice(60000);
        electricCar.displayInfo();
        System.out.println();
        electricCar.displayInfo(true, true);
    }
}
