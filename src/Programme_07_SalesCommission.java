import java.util.Scanner;

/**
 * Program that takes sales-related information like Sales ID, Seller's name, Sales amount and
 * basic salary as input and calculate the commission based on the sales amount
 */
public class Programme_07_SalesCommission {
    // Method to calculate commission based on sales amount
    public static double calculateCommission(double salesAmount) {
        if (salesAmount >= 50000) {
            return salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            return salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            return salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            return salesAmount * 0.05;
        } else {
            return salesAmount * 0.02;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sales ID: ");
        int salesID = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();
        System.out.println("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.println("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        // Calculate commission based on the sales amount
        double commission = calculateCommission(salesAmount);
        // Calculate total salary (basic salary + commission)
        double totalSalary = basicSalary + commission;
        // Print the sales information and commission
        System.out.println("____________________________________");
        System.out.println("|         Sales information         |");
        System.out.println("|___________________________________|");
        System.out.println("| Sales ID          : " + salesID + "          |");
        System.out.println("| Seller's Name     : " + sellerName + "         |");
        System.out.println("| Sales Amount      : " + salesAmount + "       |" );
        System.out.println("| Basic Salary      : " + basicSalary + "       |");
        System.out.println("____________________________________|");
        System.out.println("| Commission        : " + commission + "       |");
        System.out.println("| Total Salary      : " + totalSalary + "       |");
        System.out.println("|===================================|");
        scanner.close();
    }
}
