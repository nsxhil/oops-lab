import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStatistics {
    public static void main(String[] args) {
        String fileName = "E:/220911114/OOPs lab/Lab 10/sample.txt"; // Replace with your file's name

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int charCount = 0;
            int vowelCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            boolean isWord = false;

            int data;
            while ((data = bufferedReader.read()) != -1) {
                charCount++;

                char ch = (char) data;

                if (isVowel(ch)) {
                    vowelCount++;
                }

                if (Character.isWhitespace(ch)) {
                    if (isWord) {
                        wordCount++;
                        isWord = false;
                    }
                } else {
                    isWord = true;
                }

                if (ch == '\n') {
                    lineCount++;
                }
            }

            // Check for the last word if the file doesn't end with whitespace
            if (isWord) {
                wordCount++;
            }

            // Close the file
            bufferedReader.close();

            System.out.println("Character count: " + charCount);
            System.out.println("Vowel count: " + vowelCount);
            System.out.println("Word count: " + wordCount);
            System.out.println("Line count: " + (lineCount + 1)); // +1 to count the last line

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
