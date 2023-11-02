import java.io.*;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Write to a file");
            System.out.println("2. Read from a file");
            System.out.println("3. Copy bytes from one file to another");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            
            switch (choice) {
                case 1:
                    writeToFile();
                    break;
                case 2:
                    readFromFile();
                    break;
                case 3:
                    copyBytesFromFile();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static void writeToFile() {
        try {
            System.out.print("Enter the file name to write to: ");
            String fileName = new Scanner(System.in).nextLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            System.out.print("Enter the content to write: ");
            String content = new Scanner(System.in).nextLine();
            writer.write(content);
            writer.close();
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void readFromFile() {
        try {
            System.out.print("Enter the file name to read from: ");
            String fileName = new Scanner(System.in).nextLine();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void copyBytesFromFile() {
        try {
            System.out.print("Enter the source file name: ");
            String sourceFileName = new Scanner(System.in).nextLine();
            System.out.print("Enter the destination file name: ");
            String destinationFileName = new Scanner(System.in).nextLine();

            FileInputStream inputStream = new FileInputStream(sourceFileName);
            FileOutputStream outputStream = new FileOutputStream(destinationFileName);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
