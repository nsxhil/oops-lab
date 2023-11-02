public class NumberFormatExceptiondemo {
    public static void main(String[] args) {
        String invalidNumberString = "abc"; // Invalid string that cannot be converted to a number

        try {
            int number = Integer.parseInt(invalidNumberString);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
