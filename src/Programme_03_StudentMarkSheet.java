import java.util.Scanner;

/**
 * Java program that takes a student's name, roll number and marks in three subjects
 * (Math, Science and English) and calculates the total, percentage, result and grade.
 * Print the Mark Sheet using user entered data
 */
public class Programme_03_StudentMarkSheet {
    // Method to calculate total marks
    public static int calculateTotal(int mathMarks, int scienceMarks, int englishMarks) {
        return mathMarks + scienceMarks + englishMarks;
    }
    // Method to calculate percentage
    public static double calculatePercentage(int totalMarks) {
        return (double) totalMarks / 300 * 100;
    }
    //Method to determine result and grade
    public static String determineResultAndGrade(double percentage) {
        String result, grade;
        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }
        } else {
            result = "Fail";
            grade = "N/A";
        }
        return result + " (" + grade + ")";
    }
    public static void main(String[] args) {
        // User enters Mark Sheet data like Name, Roll No and Marks
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        System.out.println("Enter Math Marks: ");
        int mathMarks = scanner.nextInt();
        System.out.println("Enter Science Marks");
        int scienceMarks = scanner.nextInt();
        System.out.println("Enter English Marks: ");
        int englishMarks = scanner.nextInt();
        // Check if the input marks are in the value range (0-100)
        if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100.");
        } else {
            // Calculate total marks, percentage, result and grade
            int totalMarks = calculateTotal(mathMarks, scienceMarks, englishMarks);
            double percentage = calculatePercentage(totalMarks);
            String resultAndGrade = determineResultAndGrade(percentage);
            // Print the mark sheet
            System.out.println(" _____________________________ ");
            System.out.println("|                             |");
            System.out.println("|          Mark Sheet         |");
            System.out.println("|_____________________________|");
            System.out.println("| Name : " + name + "                |");
            System.out.println("| Roll No : " + rollNo + "                |");
            System.out.println("|_____________________________|");
            System.out.println("|Subjects : Marks             |");
            System.out.println("|_____________________________|");
            System.out.println("| Math    : " + mathMarks + "                |");
            System.out.println("| Science : " + scienceMarks + "                |");
            System.out.println("| English : " + englishMarks + "                |");
            System.out.println("|_____________________________|");
            System.out.println("| Total   : " + totalMarks + "               |");
            System.out.println("|_____________________________|");
            System.out.println("| Percentage : " + percentage + "%" + "          |");
            System.out.println("| Result : " + resultAndGrade + "          |");
            System.out.println("|_____________________________|");
        }
        scanner.close();
    }
}