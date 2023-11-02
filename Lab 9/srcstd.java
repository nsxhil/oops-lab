import java.util.Scanner;

class Student {
    int regNumber;
    String firstName;
    String lastName;
    String degree;

    public Student(int regNumber, String firstName, String lastName, String degree) {
        this.regNumber = regNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }
}

public class srcstd {
    public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = new Student(1, "John", "Doe", "Computer Science");
        students[1] = new Student(2, "Jane", "Smith", "Electrical Engineering");
        students[2] = new Student(3, "Alice", "Johnson", "Mechanical Engineering");
 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the search criteria (First Name or Last Name): ");
        String searchCriteria = scanner.nextLine();

        System.out.print("Enter the search keyword: ");
        String keyword = scanner.nextLine();

        boolean found = false;

        for (Student student : students) {
            if (searchCriteria.equalsIgnoreCase("First Name") && student.firstName.equalsIgnoreCase(keyword)) {
                displayStudentDetails(student);
                found = true;
            } else if (searchCriteria.equalsIgnoreCase("Last Name") && student.lastName.equalsIgnoreCase(keyword)) {
                displayStudentDetails(student);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found with the given " + searchCriteria + ": " + keyword);
        }
    }

    public static void displayStudentDetails(Student student) {
        System.out.println("Registration Number: " + student.regNumber);
        System.out.println("First Name: " + student.firstName);
        System.out.println("Last Name: " + student.lastName);
        System.out.println("Degree: " + student.degree);
        System.out.println();
    }
}
