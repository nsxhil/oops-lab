import java.util.Scanner;

public class stringopmenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString, secondString;

        while (true) {
            System.out.println("String Operations Menu:");
            System.out.println("1. Compare two strings");
            System.out.println("2. Convert uppercase characters to lowercase and vice-versa");
            System.out.println("3. Check if one string is a substring of the other");
            System.out.println("4. Replace a substring with 'Hello'");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the first string: ");
                    firstString = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    secondString = scanner.nextLine();
                    compareStrings(firstString, secondString);
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    firstString = scanner.nextLine();
                    convertCase(firstString);
                    break;
                case 3:
                    System.out.print("Enter the first string: ");
                    firstString = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    secondString = scanner.nextLine();
                    checkSubstring(firstString, secondString);
                    break;
                case 4:
                    System.out.print("Enter a string: ");
                    firstString = scanner.nextLine();
                    replaceSubstring(firstString);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }

    private static void convertCase(String str) {
        StringBuilder result = new StringBuilder(str.length());

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        System.out.println("Converted string: " + result.toString());
    }

    private static void checkSubstring(String str1, String str2) {
        if (str1.contains(str2) || str2.contains(str1)) {
            System.out.println("One string is a substring of the other.");
        } else {
            System.out.println("Strings are not substrings of each other.");
        }
    }

    private static void replaceSubstring(String str) {
        if (str.contains("Hello")) {
            str = str.replace("Hello", "World");
        }
        System.out.println("Modified string: " + str);
    }
}
