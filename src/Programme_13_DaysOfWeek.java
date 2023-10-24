import java.util.Scanner;

public class Programme_13_DaysOfWeek {
    // Method to print the day of the week based on the input number
    public static void printDayOfWeek(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "MONDAY";
                break;
            case 2:
                dayName = "TUESDAY";
                break;
            case 3:
                dayName = "WEDNESDAY";
                break;
            case 4:
                dayName = "THURSDAY";
                break;
            case 5:
                dayName = "FRIDAY";
                break;
            case 6:
                dayName = "SATURDAY";
                break;
            case 7:
                dayName = "SUNDAY";
                break;
            default:
                dayName = "Week contains 1 to 7 days";
                break;
        }
        System.out.println("Day of the week: " + dayName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7: ");
        int inputNumber = scanner.nextInt();
        // Calling the printOfWeek method to determine and print the day of the week
        printDayOfWeek(inputNumber);
        scanner.close();
    }
}
