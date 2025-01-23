public class Book {
    String title;
    String author;
    
    // Constructor 1
    public Book() {
        this("Unknown", "Unknown");
    }
    
    // Constructor 2
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "John Doe");
        
        b1.displayDetails();
        b2.displayDetails();
    }
}
