/*
 * program to demonstrate the example of constructor 
 * and Parameterized constructor
 */

public class Constructor {

    // Initialize without parameterized/default contsructor
    Constructor() {
        System.out.println("This is Default Constructor...");
    }

    // Intialized Parameterized Constructor
    Constructor(int xIntParameter, int yIntParameter) {
        int zIntValue = xIntParameter + yIntParameter;
        System.out.println(xIntParameter + " + " + yIntParameter + " = " + zIntValue);
    }

    public static void main(String[] args) {
        // Default Constructor
        new Constructor();
        // Parameterized Constructor
        new Constructor(25, 50);
    }

}
