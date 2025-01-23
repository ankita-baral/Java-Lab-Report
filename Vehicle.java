// Parent class Vehicle
class Vehicle {
    // Method to start the vehicle
    public void start() {
        System.out.println("Vehicle starts");
    }
}

// Child class Car extends Vehicle
class Car extends Vehicle {

    // Overriding the start method of Vehicle class
    @Override
    public void start() {
        super.start();  // Calls the start method of the parent class
        System.out.println("Car starts");
    }

    public static void main(String[] args) {
        // Create an object of Car class
        Car car = new Car();
        
        // Call the overridden start method
        car.start();
    }
}
