import java.util.Scanner;

/**
 * Program that takes an employee's ID, name and basic salary as input.
 * Calculates HRA, TA, DA, PF and Gross Salary.
 * Prints the salary slip in the requested format
 */
public class Programme_05_SalarySlip {
    // Method to calculate HRA
    public static double calculateHRA(double basicSalary) {
        return basicSalary * 0.10;
    }

    // Method to calculate TA
    public static double calculateTA(double basicSalary) {
        return basicSalary * 0.08;
    }

    // Method to calculate DA
    public static double calculateDA(double basicSalary) {
        return basicSalary * 0.09;
    }

    // Method to calculate PF
    public static double calculatePF(double basicSalary) {
        return basicSalary * 0.20;
    }

    // Method to calculate Gross Salary
    public static double calculateGrossSalary(double basicSalary, double hra, double ta, double da, double pf) {
        return basicSalary + hra + ta + da - pf;
    }

    public static void main(String[] args) {
        // User enters employee's details and basic salary
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.println("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        // Calculate HRA, Ta, Da and PF
        double hra = calculateHRA(basicSalary);
        double ta = calculateTA(basicSalary);
        double da = calculateDA(basicSalary);
        double pf = calculatePF(basicSalary);
        // Calculate Gross Salary
        double grossSalary = calculateGrossSalary(basicSalary, hra, ta, da, pf);
        // Print the Salary Slip
        System.out.println("___________________________________________");
        System.out.println("| Salary Slip                              |");
        System.out.println("|__________________________________________|");
        System.out.println("| Employee Id         : " + employeeId + "               |");
        System.out.println("| Employee Name       : " + employeeName + "                |");
        System.out.println("|__________________________________________|");
        System.out.println("| Basic Salary        : " + basicSalary + "            |");
        System.out.println("| HRA 10%             : " + basicSalary + "            |");
        System.out.println("| TA 8%               : " + ta + "             |");
        System.out.println("| DA 9%               : " + da + "             |");
        System.out.println("| PF - 20%            : " + pf + "             |");
        System.out.println("|__________________________________________| ");
        System.out.println("| Gross Salary        : " + grossSalary + "            |");
        System.out.println("|==========================================|");
        scanner.close();
    }
}
