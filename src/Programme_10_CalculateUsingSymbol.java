import java.util.Scanner;

/**
 * Program that takes two numbers and a mathematical symbol as input and performs
 * addition, subtraction, multiplication or division based on the provided symbol
 * using 'if-else' statements
 */
public class Programme_10_CalculateUsingSymbol {
    // Method to perform addition, subtraction, multiplication and division using 'if-else' statement
    public static int calculate(int a, int b, char op) {
        int ans = 0;
        if (op == '+') {
            ans = a + b;
        } else if (op == '-') {
            ans = a - b;
        } else if (op == '*') {
            ans = a * b;
        } else if (op == '/') {
            ans = a / b;
        }
        System.out.println("Your answer is: " + ans);
        return ans;
    }

    public static void main(String[] args) {
        // User enters data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        // User enters operand for the calculations
        System.out.println("Enter type of calculation (+, -, *, / : ");
        char op = scanner.next().charAt(0);
        // Calling the method calculate
        calculate(a, b, op);
    }
}
