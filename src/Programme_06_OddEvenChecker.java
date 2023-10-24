import java.util.Scanner;

/**
 * Program that takes a number as input and determine whether it's
 * odd or even using 'if-else' statement
 */
public class Programme_06_OddEvenChecker {
    // Method to check if a number is odd or even
    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();
        // Calling the checkOddEven method to determine if the input number is odd or even
        String result = checkOddEven(inputNumber);
        System.out.println("The input number is " + result + ".");
        scanner.close();
    }
}