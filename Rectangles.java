public class Rectangle {
    int length;
    int width;
    
    // Constructor with 2 parameters
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    // Constructor with 1 parameter (default square)
    public Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(7);
        
        r1.display();
        r2.display();
    }
}
