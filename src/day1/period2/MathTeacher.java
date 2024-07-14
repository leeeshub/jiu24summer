package day1.period2;

public class MathTeacher extends Teacher {

    public MathTeacher(String name, int age, String gender) {
        super(name, age, gender, "Math");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This teacher specializes in Mathematics.");
    }
}