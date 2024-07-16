package day2.period2;

import day1.period2.Person;
import day1.period2.Student;
import day1.period2.Teacher;


public class Main {
    public static void main(String[] args) {
        // Upcasting: Referencing subclass objects with a superclass type
        Person person1 = new Student("Hannah", 20, "F", "S000123", 2, "Computer Science");
        Person person2 = new Teacher("James", 50, "M", "Mathematics");

        // Polymorphism: Calling methods on superclass type variables
        person1.displayInfo(); // Call Student's displayInfo()
        person2.displayInfo(); // Call Teacher's displayInfo()

        System.out.println();

        // Using instanceof to check object type and downcast
        if (person1 instanceof Student) {
            Student student1 = (Student) person1; // Downcasting
            System.out.println("Student ID: " + student1.getStudentId());
            System.out.println("Major: " + student1.getMajor());
        } else {
            System.out.println("person1 is not a Student.");
        }

        if (person2 instanceof Teacher) {
            Teacher teacher1 = (Teacher) person2; // Downcasting
            System.out.println("Subject: " + teacher1.getSubject());
        } else {
            System.out.println("person2 is not a Teacher.");
        }

        System.out.println();

        // Downcasting failure: Attempting to downcast to an incorrect type
        // result : occurring Class Cast Exception
        // to deal with the exception? 
        try {
            Teacher teacher2 = (Teacher) person1; // Incorrect downcasting
        } catch (ClassCastException e) {
            System.out.println("Downcasting failed: person1 is not a Teacher.");
        }

        // Calling method after upcasting
        callDisplayInfo(person1);
        callDisplayInfo(person2);

        System.out.println();

        // Polymorphism example using an array
        Person[] people = new Person[3];
        people[0] = new Person("Luke", 25, "M");
        people[1] = new Student("Kyle", 22, "M", "S000124", 3, "Physics");
        people[2] = new Teacher("Eve", 42, "F", "Biology");

        for (Person person : people) {
            person.displayInfo();
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Student ID: " + student.getStudentId());
            } else if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("Subject: " + teacher.getSubject());
            }
            System.out.println();
        }
    }

    // Method using polymorphism
    public static void callDisplayInfo(Person person) {
        person.displayInfo();
    }
}
