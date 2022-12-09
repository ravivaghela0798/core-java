/*
 * handle exceptions using try, catch, finally, throw, and throws keywords
 */

public class Exception {

    static void fun() throws IllegalAccessException {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        int aIntValue = 10, bIntValue = 5, cIntValue = 5, resultValue;

        try {
            resultValue = aIntValue / (bIntValue - cIntValue);
            System.out.println("result" + resultValue);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught:Division by zero");
        } finally {
            System.out.println("I am in final block");
        }

        try {
            fun();
        } catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
    }

}
