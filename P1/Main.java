class Student {
    int rollNo;
    String name;
    int m1, m2, m3;

    // Constructor
    Student(int r, String n, int sub1, int sub2, int sub3) {
        rollNo = r;
        name = n;
        m1 = sub1;
        m2 = sub2;
        m3 = sub3;
    }

    // Method to calculate total
    int getTotal() {
        return m1 + m2 + m3;
    }

    // Method to calculate percentage
    double getPercentage() {
        return (getTotal() / 3.0);
    }

    // Method to display details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + getTotal());
        System.out.println("Percentage: " + getPercentage() + "%");
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating 3 student objects
        Student s1 = new Student(101, "Rahul", 85, 78, 90);
        Student s2 = new Student(102, "Aman", 70, 65, 80);
        Student s3 = new Student(103, "Priya", 92, 88, 95);

        // Displaying details
        s1.display();
        s2.display();
        s3.display();
    }
}
