/*
 * program to demonstrate two types of polymorphism 
 * like compile-time and runtime polymorphism
 */

class Parent {

    void Print() {
        System.out.println("Parent class");
    }

}

class SubClass1 extends Parent {

    void Print() {
        System.out.println("Subclass1");
    }

}

class SubClass2 extends Parent {

    void Print() {
        System.out.println("Subclass2");
    }

}

public class Polymorphism {

    public static void main(String[] args) {
        Parent parentObject = new SubClass1();
        parentObject.Print();

        parentObject = new SubClass2();
        parentObject.Print();
    }

}