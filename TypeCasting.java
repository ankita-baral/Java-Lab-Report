public class TypeCasting {
    public static void main(String[] args) {
        int num = 100;
        double dbl = num;  // Implicit casting (int to double)
        System.out.println("Integer to Double: " + dbl);

        double value = 99.99;
        int intValue = (int) value;  // Explicit casting (double to int)
        System.out.println("Double to Integer: " + intValue);
    }
}
