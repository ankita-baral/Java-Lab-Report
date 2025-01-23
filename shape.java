class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }

    void area() {
        System.out.println("Calculating circle area.");
    }
}

public class NewMethod {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw(); // Overridden method
        circle.area(); // New method in Circle
    }
}
