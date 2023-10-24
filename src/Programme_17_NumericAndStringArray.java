import java.util.Arrays;

/**
 * Program that sorts both a numeric and a string array
 */
public class Programme_17_NumericAndStringArray {
    // Method to sort a numeric array
    public static void sortNumericArray(int[] arr) {
        Arrays.sort(arr);
    }

    // Method to sort a string array
    public static void sortStringArray(String[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] numericArray = {7, 2, 10, 5, 1}; // Numeric array
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"}; // String array
        sortNumericArray(numericArray); // Sorting numeric array
        sortStringArray(stringArray); // Sorting string array
        // Display sorted arrays
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
