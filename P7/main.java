
class Demo {
    Demo() {
        System.out.println("Object constructed.");
    }

    void display() {
        System.out.println("Object is being used.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Cleanup method called.");
        super.finalize();
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.display();

        // Remove the reference to the object
        obj = null;

        System.out.println("Reference removed.");

        // Request garbage collection
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}
