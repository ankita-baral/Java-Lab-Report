public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred.");
        } finally {
            System.out.println("This is the finally block.");
        }
    }
}
