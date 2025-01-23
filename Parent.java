// Parent class
class Parent {
    // Constructor of Parent class
    Parent() {
        System.out.println("Parent constructor");
    }

    // Method to display a message in Parent class
    public void display() {
        System.out.println("Display in Parent class");
    }
}

// Child class extending Parent
class Child extends Parent {

    // Constructor of Child class
    Child() {
        super(); // Calls the Parent constructor
        System.out.println("Child constructor");
    }

    // Overridden display method in Child class
    @Override
    public void display() {
        System.out.println("Display in Child class");
    }

    public static void main(String[] args) {
        // Create an object of Child class
        Child child = new Child();

        // Call the overridden display method
        child.display();
    }
}
