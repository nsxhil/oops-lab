import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Scanner;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomAccessFile file = null;

        try {
            // Open the file in "rw" mode, which allows both reading and writing
            file = new RandomAccessFile("sample.txt", "rw");

            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Write an integer");
                System.out.println("2. Read an integer");
                System.out.println("3. Append a string");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter an integer to write: ");
                        int value = scanner.nextInt();
                        writeInt(file, value);
                        break;
                    case 2:
                        System.out.print("Enter the position to read from: ");
                        long position = scanner.nextLong();
                        int intValue = readInt(file, position);
                        System.out.println("Read integer: " + intValue);
                        break;
                    case 3:
                        System.out.print("Enter a string to append: ");
                        String appendStr = scanner.nextLine();
                        appendString(file, appendStr);
                        break;
                    case 4:
                        System.out.println("Exiting the program.");
                        file.close();
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeInt(RandomAccessFile file, int value) throws IOException {
        file.writeInt(value);
    }

    public static int readInt(RandomAccessFile file, long position) throws IOException {
        file.seek(position);
        return file.readInt();
    }

    public static void appendString(RandomAccessFile file, String text) throws IOException {
        // Seek to the end of the file to append
        file.seek(file.length());
        file.writeUTF(text);
    }
}
