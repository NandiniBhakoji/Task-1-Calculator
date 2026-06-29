import java.util.Scanner;

public class Task_1 {

    // Methods for basic operations
    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== CALCULATOR MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            double num1, num2, result;

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();

                    result = add(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();

                    result = subtract(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();

                    result = multiply(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();

                    result = divide(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 5:
                    System.out.println("Exiting Calculator...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}