import java.util.Scanner;

/**
 *Write a method isLeapYear with a parameter of type int named year. The parameter needs to be greater
 * than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false. A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Write another method getDaysInMonth with two parameter month and year. Both of type int.
 * If parameter month is < 1 or >12 return -1. If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month. Be careful about leap years they have 29 days in
 * month 2 (February). You should check if the year is a leap year using the method isLeapYear describe above.
 */
public class Programme_04_LeapYearDaysInMonth {
    // Method to determine if entered year is a leap year or not using 'if-else' statement
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
    // Method to determine days of the month which is entered by the user using 'if-else' statement
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        boolean isLeap = isLeapYear(year);

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    if (isLeap) {
                        return 29;
                    } else {
                        return 28;
                    }
                default:
                    return -1;
            }
        }

    public static void main(String[] args) {
        // User enters desired year and month
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year (1-9999): ");// For leap year determination
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is not a leap year.");
        } else {
            System.out.println("Invalid Entry: Please enter a year from 1 to 9999.");
        }
        System.out.println("Enter a month (1-12): "); // For printing number of days in a month
        int month = scanner.nextInt();
        System.out.println("Enter a year (1-9999): ");
        int yearForMonth = scanner.nextInt();
        int daysInMonth = getDaysInMonth(month, yearForMonth);
        if (daysInMonth == -1) {
            System.out.println("Invalid input for month (1-12) or year(1-9999).");
        } else {
            System.out.println("There are " + daysInMonth + " days in month " + month + " of year " + yearForMonth + ".");
        }
        scanner.close();
    }
}
