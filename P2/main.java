public class vehicle {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");
        Car car = new Car("Toyota", 2024, 4);
        car.showDetails();
        car.start();
        car.drive();

        System.out.println("\n=== Multilevel Inheritance ===");
        Manager manager = new Manager("Asha", 1001, 85000, "Engineering", 8);
        manager.introduce();
        manager.work();
        manager.manageTeam();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Shape circle = new Circle("Blue", 5);
        Shape rectangle = new Rectangle("Red", 4, 6);
        circle.displayArea();
        rectangle.displayArea();
    }
}

class Vehicle {
    private final String brand;
    private final int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void showDetails() {
        System.out.println("Vehicle: " + year + " " + brand);
    }

    void start() {
        System.out.println(brand + " vehicle is starting.");
    }
}

class Car extends Vehicle {
    private final int doors;

    Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    void drive() {
        System.out.println("Car is driving with " + doors + " doors.");
    }
}

class Person {
    private final String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("My name is " + name + ".");
    }
}

class Employee extends Person {
    private final int employeeId;
    private final double salary;

    Employee(String name, int employeeId, double salary) {
        super(name);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void work() {
        System.out.printf("Employee #%d is working (salary: $%.2f).%n", employeeId, salary);
    }
}

class Manager extends Employee {
    private final String department;
    private final int teamSize;

    Manager(String name, int employeeId, double salary, String department, int teamSize) {
        super(name, employeeId, salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    void manageTeam() {
        System.out.println("Managing the " + department + " department team of " + teamSize + ".");
    }
}

abstract class Shape {
    private final String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();

    void displayArea() {
        System.out.printf("%s %s area: %.2f%n",
                color, getClass().getSimpleName(), calculateArea());
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

