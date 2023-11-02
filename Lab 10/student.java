import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = 0;
        try {
            rollNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid roll number. Please enter a valid integer.");
            return; // Terminate the program
        }

        System.out.print("Enter marks in Subject 1: ");
        int subject1 = 0;
        try {
            subject1 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks for Subject 1. Please enter a valid integer.");
            return; // Terminate the program
        }

        System.out.print("Enter marks in Subject 2: ");
        int subject2 = 0;
        try {
            subject2 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks for Subject 2. Please enter a valid integer.");
            return; // Terminate the program
        }

        System.out.print("Enter marks in Subject 3: ");
        int subject3 = 0;
        try {
            subject3 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks for Subject 3. Please enter a valid integer.");
            return; // Terminate the program
        }

        // Calculate percentage
        double totalMarks = subject1 + subject2 + subject3;
        double percentage = (totalMarks / (3 * 100)) * 100;

        // Assign a grade
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the result
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks in Subject 1: " + subject1);
        System.out.println("Marks in Subject 2: " + subject2);
        System.out.println("Marks in Subject 3: " + subject3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
