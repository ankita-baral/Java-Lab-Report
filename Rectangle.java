public class Rectangle {

    // Instance variables
    int length;
    int width;

    // Constructor to initialize dimensions
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle(10, 5);

        // Calculate and print the area
        System.out.println("Area of the rectangle: " + rect.calculateArea());
    }
}
