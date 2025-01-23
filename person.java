public class Person {
    String name;
    
    // Constructor
    public Person(String name) {
        this.name = name;
        System.out.println("Person created: " + name);
    }
    
    public static void main(String[] args) {
        Person p = new Person("Alice");
    }
}
