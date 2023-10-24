import java.util.Scanner;

/**
 * Program that takes an alphabet from 'A to F' as input and prints the
 * * corresponding city name. If any other alphabet is entered, it will display an
 * * "invalid Entry" message.
 * * Use of 'switch' statement
 */
public class Programme_09_PrintCityNameUsingSwitch {
    // Method to determine the city name based on the provided alphabet
    public static void displayCityName(char alphabet) {
        String cityName;
        switch (alphabet) {
            case 'A':
                cityName = "Anand";
                break;
            case 'B':
                cityName = "Bangkok";
                break;
            case 'C':
                cityName = "Cincinnati";
                break;
            case 'D':
                cityName = "Dhaka";
                break;
            case 'E':
                cityName = "Exeter";
                break;
            case 'F':
                cityName = "Florence";
                break;
            default:
                cityName = "Invalid Entry";
                break;
        }
        System.out.println("City Name: " + cityName);
    }
    public static void main(String[] args) {
        // User enters alphabet between 'A to F' as input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet (A to F): ");
        char inputAlphabet = scanner.next().charAt(0);
        // Convert the input to uppercase to handle both lowercase and uppercase inputs
        inputAlphabet = Character.toUpperCase(inputAlphabet);
        // Calling the displayCityName method to find and print the city name
        displayCityName(inputAlphabet);
        scanner.close();
    }
}
