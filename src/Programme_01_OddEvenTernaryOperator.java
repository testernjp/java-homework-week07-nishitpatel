import java.util.Scanner;

/**
 * Java Program that determines whether the input number is odd or even using the ternary operator
 */
public class Programme_01_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt(); //Read the input number
        //Call the checkOddEven method to determine if the input number is odd or even
        String result = checkOddEven(number);
        System.out.println("The input number is " + result + ".");
    }
    //Method to determine if a number is odd or even using the ternary operation
    public static String checkOddEven(int number) {
        String result = (number % 2 == 0) ? "even" : "odd";
        return result;
    }
}