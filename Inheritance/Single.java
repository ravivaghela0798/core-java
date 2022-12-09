/*
 * this is single level inheritance one parent 
 * and that parent extend in one child class and use parent property
 */

class Animal {

    void eat() {
        System.out.println("eating...");
    }

}

class Dog extends Animal {

    void bark() {
        System.out.println("barking...");
    }

}

public class Single {

    public static void main(String args[]) {
        Dog dogObject = new Dog();
        dogObject.bark();
        dogObject.eat();
    }

}
