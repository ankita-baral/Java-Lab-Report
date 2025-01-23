//custom package
// File: utility/MathUtils.java
package utility;

public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}

// File: Main.java
import static utility.MathUtils.add;

public class Addition {
    public static void main(String[] args) {
        int result = add(10, 20); // No need to specify the class name
        System.out.println("Sum: " + result);
    }
}
