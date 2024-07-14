public class Student extends Person{
    private String studentId;
    private int grade;
    private String major;

    // constructor
    public Student(String name, int age, String gender, String studentId, int grade, String major) {
        super(name, age, gender);
        this.studentId = studentId;
        this.grade = grade;
        this.major = major;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }

    // getter and setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String newStudentId) {
        studentId = newStudentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int newGrade) {
        grade = newGrade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String newMajor) {
        major = newMajor;
    }
}
