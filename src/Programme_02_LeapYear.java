import java.util.Scanner;

/**
 *  Java program that checks if a given year is a leap year or not using 'if-else' statement
 */
public class Programme_02_LeapYear {
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            /**
             * A year is a leap year if it is divisible by 4 and not divisible by 100
             * or if it is divisible by 400.
             */
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        // User enters the year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int inputYear = scanner.nextInt();
        // Calling the isLeapYear method to check if the input year is a leap year
        boolean isLeap = isLeapYear(inputYear);
        if (isLeap) {
            System.out.println(inputYear + " is a leap year.");
        } else {
            System.out.println(inputYear + " is not a leap year.");
        }
        scanner.close();
    }
}