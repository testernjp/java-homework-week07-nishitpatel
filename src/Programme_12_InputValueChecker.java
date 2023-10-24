import java.util.Scanner;

/**
 * Program that checks whether the input value is a number, an alphabet or a symbol
 * Using 'if-else' statement
 */
public class Programme_12_InputValueChecker {
    // Method to check if a character is an alphabet
    public static boolean isAlphabet(char c) {
        return Character.isLetter(c);
    }
    // Method to check if a character is a number
    public static boolean isNumber(char c) {
        return Character.isDigit(c);
    }
    //Method to check if a character is a symbol (non-alphabet, non-number)
    public static boolean isSymbol(char c) {
        return !isAlphabet(c) && !isNumber(c);
    }
    public static void main(String[] args) {
        // User enters desired value such as a number, an alphabet or a symbol
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);
        if (isAlphabet(input)) {
            System.out.println("The input is an alphabet.");
        } else if (isNumber(input)) {
            System.out.println("The input is a number.");
        } else if (isSymbol(input)) {
            System.out.println("The input is a symbol.");
        } else {
            System.out.println("Invalid input.");
        }
        scanner.close();
    }
}
