import java.util.Scanner;

public class NegativeRootChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        try {
            double number = Double.parseDouble(scanner.nextLine());
            
            if (number < 0) {
                System.out.println("Error: Negative input. Cannot calculate the square root of a negative number.");
            } else {
                double squareRoot = Math.sqrt(number);
                System.out.println("Square root of " + number + " is " + squareRoot);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
