import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Physics marks: ");
        double phy = scanner.nextDouble();

        System.out.print("Enter the Maths marks: ");
        double maths = scanner.nextDouble();

        System.out.print("Enter the chemistry marks: ");
        double chem = scanner.nextDouble();

        System.out.print("Enter the English marks: ");
        double eng = scanner.nextDouble();

        System.out.print("Enter the Computer marks: ");
        double comp = scanner.nextDouble();

        double total = phy + maths + chem + eng + comp;
        System.out.print("Total Marks of the Student : " + total);

        double AveragePercentage = (total / 500) * 100;
        System.out.println("Average Percentage of the Student : " + AveragePercentage);

        if (AveragePercentage >= 90) {
            System.out.println("The student's grade is: A");
        } else if (AveragePercentage >= 80) {
            System.out.println("The student's grade is: B");
        } else if (AveragePercentage >= 70) {
            System.out.println("The student's grade is: C");
        } else if (AveragePercentage >= 60) {
            System.out.println("The student's grade is: D");
        } else {
            System.out.println("The student's grade is: F");
        }

        scanner.close();
    }
}
