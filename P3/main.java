
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Demonstrating method overloading
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Base class for runtime polymorphism
class Employee {
    double calculatePay() {
        return 0;
    }
}

// Derived class 1
class FullTimeEmployee extends Employee {

    @Override
    double calculatePay() {
        return 50000;
    }
}

// Derived class 2
class PartTimeEmployee extends Employee {

    @Override
    double calculatePay() {
        return 20000;
    }
}

// Implements two interfaces
class AllInOnePrinter implements Printable, Scannable {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Base class for hybrid inheritance
class Machine {

    void start() {
        System.out.println("Machine started.");
    }
}

// Derived class extending a class and implementing interfaces
class SmartPrinter extends Machine implements Printable, Scannable {

    @Override
    public void print() {
        System.out.println("Smart printer is printing.");
    }

    @Override
    public void scan() {
        System.out.println("Smart printer is scanning.");
    }

    void connectToWiFi() {
        System.out.println("Connected to WiFi.");
    }
}

public class Main {

    public static void main(String[] args) {

        // 1. Compile-time polymorphism: Method overloading
        System.out.println("=== Method Overloading ===");

        Calculator c = new Calculator();

        System.out.println("Addition of two integers: " + c.add(10, 20));
        System.out.println("Addition of three integers: " + c.add(10, 20, 30));
        System.out.println("Addition of decimal numbers: " + c.add(5.5, 4.5));

        // 2. Runtime polymorphism: Method overriding
        System.out.println("\n=== Method Overriding ===");

        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full-time employee pay: " + e.calculatePay());

        e = new PartTimeEmployee();
        System.out.println("Part-time employee pay: " + e.calculatePay());

        // 3. Multiple interface implementation
        System.out.println("\n=== Multiple Interfaces ===");

        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        // 4. Hybrid inheritance
        System.out.println("\n=== Hybrid Inheritance ===");

        SmartPrinter smart = new SmartPrinter();

        smart.start();
        smart.print();
        smart.scan();
        smart.connectToWiFi();

        // Demonstrating interface references
        System.out.println("\n=== Interface References ===");

        Printable p = smart;
        Scannable s = smart;

        p.print();
        s.scan();
    }
}

