
class Book {
    String title;
    String author;
    double price;

    // No-argument constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        // Object using no-argument constructor
        Book b1 = new Book();

        // Object using parameterized constructor
        Book b2 = new Book("Wings of Fire", "A. P. J. Abdul Kalam", 250);

        // Object using copy constructor
        Book b3 = new Book(b2);

        System.out.println("Book 1: No-argument constructor");
        b1.display();

        System.out.println("Book 2: Parameterized constructor");
        b2.display();

        System.out.println("Book 3: Copy constructor");
        b3.display();

        // Modify the copied object
        b3.price = 300;
        b3.title = "Updated Book";

        System.out.println("After modifying the copied object:");

        System.out.println("Original book (b2):");
        b2.display();

        System.out.println("Copied book (b3):");
        b3.display();
    }
}
