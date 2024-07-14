package day1.period2;

public class EnglishTeacher extends Teacher {

    public EnglishTeacher(String name, int age, String gender) {
        super(name, age, gender, "English");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This teacher specializes in English.");
    }
}