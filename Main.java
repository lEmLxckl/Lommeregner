package src;

import java.util.Scanner;

/**
 * Main class to run the calculator application.
 */
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        // Get the first number from the user
        System.out.print("Skriv første tal: ");
        double a = scanner.nextDouble();
        
        // Get the second number from the user
        System.out.print("Skriv andet tal: ");
        double b = scanner.nextDouble();
        
        // Display operator options and get user input
        System.out.println("Vælg operator (+, -, *, /): ");
        String operator = scanner.next();
        
        // Perform calculation based on the operator chosen
        try {
            double result = performCalculation(calculator, operator, a, b);
            System.out.println("Resultat: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Fejl: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner resource
        }
    }

    /**
     * Performs the calculation based on the given operator.
     * 
     * @param calculator the calculator instance
     * @param operator the operator chosen by the user
     * @param a the first operand
     * @param b the second operand
     * @return the result of the calculation
     * @throws IllegalArgumentException if an invalid operator is provided
     */
    private static double performCalculation(Calculator calculator, String operator, double a, double b) {
        switch (operator) {
            case "+":
                return calculator.add(a, b);
            case "-":
                return calculator.subtract(a, b);
            case "*":
                return calculator.multiply(a, b);
            case "/":
                return calculator.divide(a, b);
            default:
                throw new IllegalArgumentException("Ugyldig operator: " + operator);
        }
    }
}
