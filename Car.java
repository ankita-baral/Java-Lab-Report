public class Car {
    String model;
    
    // Default constructor
    public Car() {
        model = "Unknown";
    }
    
    public void displayModel() {
        System.out.println("Car model: " + model);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.displayModel();
    }
}
