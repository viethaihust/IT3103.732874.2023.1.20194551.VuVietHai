package OtherProjects.Lab01;
import java.util.Scanner;
public class SolveEquation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Select the type of equation to solve:");
        System.out.println("1. First-degree equation with one variable (ax + b = 0)");
        System.out.println("2. System of first-degree equations with two variables (a11x1 + a12x2 = b1 & a21x1 + a22x2 = b2)");
        System.out.println("3. Second-degree equation with one variable (ax^2 + bx + c = 0)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            solveFirstDegreeEquation();
        } else if (choice == 2) {
            solveSystemOfFirstDegreeEquations();
        } else if (choice == 3) {
            solveSecondDegreeEquation();
        } else {
            System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
    }

    public static void solveFirstDegreeEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of 'b': ");
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("'a' cannot be zero.");
        } else {
            double x = -b / a;
            System.out.println("Solution: x = " + x);
        }
    }

    public static void solveSystemOfFirstDegreeEquations() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a_11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Enter a_12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Enter b_1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter a_21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Enter a_22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Enter b_2: ");
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void solveSecondDegreeEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of 'b': ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of 'c': ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("'a' cannot be zero.");
        } else if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two distinct real roots: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("One real root: x = " + x);
        } else {
            System.out.println("No real roots.");
        }
	}
}
