/**
 * Program that calculates the average value of array elements
 */
public class Programme_19_AverageOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Sample arrays of integers
        double average = calculateAverage(numbers); // Calling calculateAverage method
        System.out.println("The average of the array elements is: " + average);
    }
    // Method to calculate the average of an array
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        double average = (double) sum / arr.length;
        return average;
    }
}
