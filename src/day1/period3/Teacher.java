package day1.period3;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String gender, String subject) {
        super(name, age, gender);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

    // getter and setter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String newSubject) {
        subject = newSubject;
    }
}
