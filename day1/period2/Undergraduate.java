import jiu24summer.day1.period2.Student;

public class Undergraduate extends Student {
    private double totalGrade;
    private int earnedCredit;

    // constructor
    public Undergraduate(String name, int age, String gender, String studentId, int grade, String major, double totalGrade, int earnedCredit) {
        super(name, age, gender, studentId, grade, major);
        this.totalGrade = totalGrade;
        this.earnedCredit = earnedCredit;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Grade: " + totalGrade + ", Earned Credit: " + earnedCredit);
    }

    // getter and setter
    public double getTotalGrade() {
        return totalGrade;
    }
    
    public void setTotalGrade(double grade) {
        totalGrade = grade;
    }

    public int getEarnedCredit() {
        return earnedCredit;
    }

    public void setEarnedCredit(int credit) {
        earnedCredit = credit;
    }
}
