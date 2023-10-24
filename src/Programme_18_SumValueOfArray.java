/**
 * Java program with a separate method to calculate the sum of values in an array
 */
public class Programme_18_SumValueOfArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Sample array of integers
        int sum = sumArrayValues(numbers); // Calling the sum method, passing the array as argument
        System.out.println("The sum of the array values is: " + sum);
    }
    // Method to calculate sum of values in an array
    public static int sumArrayValues(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}
