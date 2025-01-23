// Base class Employee
class Employee {
    // Method to display details of the employee
    public void details(String name) {
        System.out.println("Employee Name: " + name);
    }
}

// Derived class Manager
class Manager extends Employee {
    // Overriding the details method to display manager details
    @Override
    public void details(String name) {
        System.out.println("Manager Name: " + name);
    }

    // Main method
    public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager();
        
        // Calling the overridden method in the Manager class
        manager.details("John");
        
        // Output: Manager Name: John
    }
}
