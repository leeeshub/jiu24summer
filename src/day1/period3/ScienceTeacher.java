package day1.period3;

public class ScienceTeacher extends Teacher {

    public ScienceTeacher(String name, int age, String gender) {
        super(name, age, gender, "Science");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This teacher specializes in Science.");
    }
}