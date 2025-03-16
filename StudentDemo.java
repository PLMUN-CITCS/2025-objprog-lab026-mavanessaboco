// Student class definition
class Student {
    // Private instance variables for name, id, and GPA
    private String name;
    private int id;
    private double gpa;

    // Static variable to keep track of the number of students
    private static int studentCount = 0;

    // Constructor to initialize student details and increment studentCount
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++;  // Increment student count for every new student object
    }

    // Instance method to display student details
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    // Static method to display the total number of students
    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

// Main class to run the program
public class StudentDemo {
    public static void main(String[] args) {
        // Create three Student objects with different names, IDs, and GPAs
        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.5);
        Student student3 = new Student("Charlie", 103, 3.9);

        // Call the displayStudentInfo() method on each student object
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        // Call the static displayStudentCount() method using the class name
        Student.displayStudentCount();
    }
}