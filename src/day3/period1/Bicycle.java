package day3.period1;

public class Bicycle implements Movable {
    private String type;
    private int speed;
    private String direction;

    public Bicycle(String type) {
        this.type = type;
        this.speed = 5;
        this.direction = "North";
    }

    @Override
    public void move() {
        System.out.println(type + " bicycle is moving at speed " + speed + " towards " + direction + ".");
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println(type + " bicycle has stopped.");
    }

    @Override
    public void turnLeft() {
        direction = changeDirection(direction, "left");
        System.out.println(type + " bicycle is turning left. New direction is " + direction + ".");
    }

    @Override
    public void turnRight() {
        direction = changeDirection(direction, "right");
        System.out.println(type + " bicycle is turning right. New direction is " + direction + ".");
    }

    @Override
    public void accelerate() {
        speed += 1;
        System.out.println(type + " bicycle is accelerating. New speed is " + speed + ".");
    }

    @Override
    public void decelerate() {
        speed -= 1;
        if (speed < 0) speed = 0;
        System.out.println(type + " bicycle is decelerating. New speed is " + speed + ".");
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
