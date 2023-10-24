import java.util.Scanner;

/**
 * Program that checks if an entered number is "POSITIVE", "NEGATIVE" OR "ZERO"
 */
public class Programme_16_PositiveNegativeOrZero {
    // Method to check if a number is positive, negative or zero
    public static String checkNumber(double number) {
        if (number > 0) {
            return "POSITIVE";
        } else if (number < 0) {
            return "NEGATIVE";
        } else {
            return "ZERO";
        }
    }
    public static void main(String[] args) {
        // User enters a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        scanner.close();
        // Calling checkNumber method to determine the number's sign
        String result = checkNumber(number);
        System.out.println("The entered number is: " + result);
    }
}