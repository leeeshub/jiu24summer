public class Person {
    private String name;
    private int age;
    private String gender;      // M or F

    // constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getGender(String newGender) {
        return gender;
    }
    
    public void setGender(String newGender) {
        gender = newGender;
    }
}