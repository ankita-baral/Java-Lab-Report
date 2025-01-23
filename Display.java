public class Display {
    // Method to display one integer
    public void show(int x) {
        System.out.println("Integer: " + x);
    }
    
    // Overloaded method to display a string
    public void show(String str) {
        System.out.println("String: " + str);
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.show(10); // Calls the integer version
        display.show("Hello, Overloading!"); // Calls the string version
    }
}
