import java.util.Scanner;

/**
 * Program that takes an alphabet from 'A to F' as input and prints the
 * corresponding city name. If any other alphabet is entered, it will display an
 * "invalid Entry" message.
 * Use of 'if-else' statement
 */
public class Programme_08_PrintCityNameUsingIfElse {
    // Method to find and return the city name based on the input alphabet
    public static void printCityName(char alphabet) {
        if (alphabet == 'A') {
            System.out.println("City Name: Ahmedabad");
        } else if (alphabet == 'B') {
            System.out.println("City Name: Berlin");
        } else if (alphabet == 'C') {
            System.out.println("City Name: Cairo ");
        } else if (alphabet == 'D') {
            System.out.println("City Name: Dallas");
        } else if (alphabet == 'E') {
            System.out.println("City Name: Edinburgh");
        } else if (alphabet == 'F') {
            System.out.println("City Name: Frankfurt");
        } else {
            System.out.println("Invalid Entry: Please enter an alphabet from A to F.");
        }
    }
    public static void main(String[] args) {
        // User enters desired alphabet to print city name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet (A to F): ");
        char inputAlphabet = scanner.next().charAt(0);
        // Convert the input to uppercase to handle both lowercase and uppercase inputs
        inputAlphabet = Character.toUpperCase(inputAlphabet);
        // Calling the printCityName method to declare and print the city name
        printCityName(inputAlphabet);
        scanner.close();
    }
}