/*
 * practical to use this/s uper variable create parant class and extend in child class 
 * and use this keyword for child class property and super keyword for parent class 
 */

class Super {

    int aIntValue = 50;
    int bIntValue = 100;

}

public class SuperThis extends Super {

    void result() {
        int aIntValue = 1000;
        int bIntValue = 5000;
        System.out.println(super.aIntValue);
        System.out.println(aIntValue);
        System.out.println(super.bIntValue);
        System.out.println(bIntValue);
    }

    public static void main(String[] args) {
        new SuperThis().result();
    }

}
