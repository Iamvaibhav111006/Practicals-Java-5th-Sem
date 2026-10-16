
class Product {
    String productName;
    double price;
    int quantity;

    // 1. No-argument constructor
    Product() {
        productName = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    // 2. Constructor with product name only
    Product(String productName) {
        this.productName = productName;
        price = 0.0;
        quantity = 0;
    }

    // 3. Constructor with product name and price
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        quantity = 0;
    }

    // 4. Constructor with all three fields
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate total cost
    double calculateTotalCost() {
        return price * quantity;
    }

    // Display product details
    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("--------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Pen");
        Product p3 = new Product("Notebook", 50.0);
        Product p4 = new Product("Bag", 800.0, 2);

        System.out.println("Product 1: No-argument constructor");
        p1.display();

        System.out.println("Product 2: Name-only constructor");
        p2.display();

        System.out.println("Product 3: Name and price constructor");
        p3.display();

        System.out.println("Product 4: All-fields constructor");
        p4.display();
    }
}
