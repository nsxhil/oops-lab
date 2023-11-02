import java.util.Scanner;

public class addq5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-letter word: ");
        String inputWord = scanner.next();

        if (inputWord.length() != 5) {
            System.out.println("Please enter a five-letter word.");
        } else {
            generateThreeLetterWords(inputWord);
        }

        scanner.close();
    }

    private static void generateThreeLetterWords(String word) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i != j && i != k && j != k) {
                        String threeLetterWord = "" + word.charAt(i) + word.charAt(j) + word.charAt(k);
                        System.out.println(threeLetterWord);
                    }
                }
            }
        }
    }
}
