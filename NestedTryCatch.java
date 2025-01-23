public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0; // Inner exception
                System.out.println("Inner Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero.");
            }
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Outer exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Invalid index.");
        }
    }
}
