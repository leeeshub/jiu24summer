package day1.period2;

public class Graduate extends Student {
    private String researchArea;

    public Graduate(String name, int age, String gender, String studentId, int grade, String major, String researchArea) {
        super(name, age, gender, studentId, grade, major);
        this.researchArea = researchArea;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Area: " + researchArea);
    }

    // getter and setter
    public String getresearchArea() {
        return researchArea;
    }

    public void setThesisTitle(String newResearchArea) {
        researchArea = newResearchArea;
    }
}
