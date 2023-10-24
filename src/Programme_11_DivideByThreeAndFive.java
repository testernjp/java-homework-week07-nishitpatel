/**
 * Program that prints numbers between 1 to 100 that can be divided by 3 and 5 separately
 * Using 'if' statement
 */
public class Programme_11_DivideByThreeAndFive {
    // Method to print numbers from 1 to 100 divisible by 3
    public static void printNumbersDivisibleByThree(int num) {
        if (num <= 100) {
            if (num % 3 == 0) {
                    System.out.print(num + " ");
            }
            printNumbersDivisibleByThree(num + 1);
        }
    }
    // Method to print numbers from 1 to 100 divisible by 5
    public static void printNumbersDivisibleByFive(int num) {
        if (num <= 100) {
            if (num % 5 == 0) {
                System.out.print(num + " ");
            }
            printNumbersDivisibleByFive(num + 1);
        }
    }
    public static void main(String[] args) {
        // Printing numbers 1 to 100 divisible by 3
        System.out.println("Numbers between 1 and 100 divisible by 3: ");
        printNumbersDivisibleByThree(1);
        System.out.println(); //Control given to next line for better printing
        // Printing numbers 1 to 100 divisible by 5
        System.out.println("Numbers between 1 and 100 divisible by 5: ");
        printNumbersDivisibleByFive(1);
    }
}
