/**
 * Program that tests if an array contains a specific value
 */
public class Programme_20_ArraySpecificValue {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 7, 19, 15}; // Sample of arrays
        int valueToFind = 7;
        // Calling the containsValue method to check if the array contains tha target value
        boolean contains = containsValue(numbers, valueToFind);
        if (contains) {
            System.out.println("The array contains the value " + valueToFind);
        } else {
            System.out.println("The array does not contain the value " + valueToFind);
        }
    }
    // Method to check if an array contains a specific value
    public static boolean containsValue(int[] arr, int value) {
        for (int elements : arr) {
            if (elements == value) {
                return true;
            }
        }
        return false;
    }
}
