
class Calculator {
    // Method overloading
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

// Base class
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

public class Main {
    public static void main(String[] args) {

        // Compile-time polymorphism
        Calculator c = new Calculator();

        System.out.println("Addition of 2 integers: " + c.add(10, 20));
        System.out.println("Addition of 3 integers: " + c.add(10, 20, 30));
        System.out.println("Addition of decimals: " + c.add(5.5, 4.5));

        // Runtime polymorphism
        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full-time pay: " + e.calculatePay());

        e = new PartTimeEmployee();
        System.out.println("Part-time pay: " + e.calculatePay());
    }
}
