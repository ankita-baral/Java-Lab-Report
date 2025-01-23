public class IncrementDecrement {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Original value: " + num);
        System.out.println("Post-increment: " + (num++));  // Prints, then increments
        System.out.println("After post-increment: " + num);
        System.out.println("Pre-decrement: " + (--num));   // Decrements, then prints
    }
}
