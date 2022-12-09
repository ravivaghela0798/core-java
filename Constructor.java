public class Constructor {
    // Initialize without parameterized/default contsructor
    Constructor() {
        System.out.println("This is Default Constructor...");
    }

    // Intialized Parameterized Constructor
    Constructor(int x, int y) {
        int z = x + y;
        System.out.println(x + " + " + y + " = " + z);
    }

    public static void main(String[] args) {
        // Default Constructor
        new Constructor();
        // Parameterized Constructor
        new Constructor(25, 50);
    }
}
