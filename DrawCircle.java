//custom package
// File: shapes/geometry/Circle.java
package shapes.geometry;

public class Circle {
    public void draw() {
        System.out.println("Drawing a Circle!");
    }
}

// File: DrawCircle.java
import shapes.geometry.Circle;

public class DrawCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }
}
