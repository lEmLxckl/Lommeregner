package src;

/**
 * A simple calculator class that performs basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two numbers.
     * 
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public double add(double a, double b) {
        return a + b; 
    }

    /**
     * Subtracts the second number from the first.
     * 
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return the result of a minus b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * 
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     * 
     * @param a the numerator
     * @param b the denominator
     * @return the result of a divided by b
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        return a / b;
    }
}
