/*
 * practical to compare two variables of Wrapper class using Wrapper classes
 */

public class WrapperClass {

    public static void main(String[] args) {
        int aIntValue = 10;
        Integer bIntegerValue = 10;

        System.out.println(aIntValue == bIntegerValue);
        System.out.println(bIntegerValue.equals(aIntValue));
    }

}
