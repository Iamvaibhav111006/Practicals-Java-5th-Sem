
class ComplexNumber {
    double real;
    double imaginary;

    // Constructor
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Add two complex numbers
    ComplexNumber add(ComplexNumber other) {
        double r = this.real + other.real;
        double i = this.imaginary + other.imaginary;

        return new ComplexNumber(r, i);
    }

    // Display the complex number
    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(4, 3);
        ComplexNumber c2 = new ComplexNumber(2, 5);

        System.out.print("First complex number: ");
        c1.display();

        System.out.print("Second complex number: ");
        c2.display();

        ComplexNumber result = c1.add(c2);

        System.out.print("Sum: ");
        result.display();
    }
}
