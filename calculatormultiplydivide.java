public class CalculatorMultiplyDivide {

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        CalculatorMultiplyDivide calc = new CalculatorMultiplyDivide(); // Create a Calculator object

        // Call the multiplication method
        System.out.println("Multiplication: " + calc.multiply(4, 5));

        // Call the division method
        try {
            System.out.println("Division: " + calc.divide(20.0, 2.0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
