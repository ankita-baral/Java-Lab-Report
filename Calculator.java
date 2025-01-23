public class Calculator {
    // Overloaded method for addition of two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method for addition of three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two numbers: " + calc.add(10, 20));
        System.out.println("Sum of three numbers: " + calc.add(10, 20, 30));
    }
}
