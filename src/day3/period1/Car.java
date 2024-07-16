package day3.period1;

public class Car implements Movable {
    private String model;
    private int speed;
    private String direction;

    public Car(String model) {
        this.model = model;
        this.speed = 10;  // initial speed
        this.direction = "North";  // initalize direction
    }

    @Override
    public void move() {
        System.out.println(model + " car is moving at speed " + speed + " towards " + direction + ".");
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println(model + " car has stopped.");
    }

    @Override
    public void turnLeft() {
        direction = changeDirection(direction, "left");
        System.out.println(model + " car is turning left. New direction is " + direction + ".");
    }

    @Override
    public void turnRight() {
        direction = changeDirection(direction, "right");
        System.out.println(model + " car is turning right. New direction is " + direction + ".");
    }

    @Override
    public void accelerate() {
        speed += 3;
        System.out.println(model + " car is accelerating. New speed is " + speed + ".");
    }

    @Override
    public void decelerate() {
        speed -= 3;
        if (speed < 0) speed = 0;
        System.out.println(model + " car is decelerating. New speed is " + speed + ".");
    }

    private String changeDirection(String currentDirection, String turn) {
        String[] directions = {"North", "East", "South", "West"};
        int currentIndex = java.util.Arrays.asList(directions).indexOf(currentDirection);
        if (turn.equals("left")) {
            currentIndex = (currentIndex - 1 + directions.length) % directions.length;
        } else {
            currentIndex = (currentIndex + 1) % directions.length;
        }
        return directions[currentIndex];
    }
}
