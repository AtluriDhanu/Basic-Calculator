package Code;

import java.util.Scanner;

public class Basic_Calculator {

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed");
            return 0;
        }
        return (double) num1 / num2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("     Simple Calculator     ");
            System.out.println("***************************");

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("Choose the Operation to perform: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice (1-4): ");

            int choice = sc.nextInt();
            double result = 0;

            switch (choice) {
                case 1:
                    result = addition(num1, num2);
                    System.out.println("Answer: " + result);
                    break;

                case 2:
                    result = subtraction(num1, num2);
                    System.out.println("Answer: " + result);
                    break;

                case 3:
                    result = multiplication(num1, num2);
                    System.out.println("Answer: " + result);
                    break;

                case 4:
                    result = division(num1, num2);
                    System.out.println("Answer: " + result);
                    break;

                default:
                    System.out.println("Invalid Choice...");
            }

            System.out.println("\n-----------------------------\n");
        }
    }
}

