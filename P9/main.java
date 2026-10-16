
class Employee {
    String employeeName;
    double salary;

    // Static field shared by all Employee objects
    static int count = 0;

    // No-argument constructor
    Employee() {
        this("Unknown", 0.0);
    }

    // Parameterized constructor
    Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
        count++;
    }

    // Display employee details
    void display() {
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Salary: " + this.salary);
        System.out.println();
    }

    // Static method to display employee count
    static void displayCount() {
        System.out.println("Total Employees Created: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Rahul", 25000);
        Employee e3 = new Employee("Priya", 35000);

        System.out.println("Employee 1:");
        e1.display();

        System.out.println("Employee 2:");
        e2.display();

        System.out.println("Employee 3:");
        e3.display();

        Employee.displayCount();
    }
}
