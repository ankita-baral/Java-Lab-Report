public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Array index out of bounds
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid index.");
        }
    }
}
