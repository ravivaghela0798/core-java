/*
 * Hierarchical inherotance from create one parent class 
 * and create two child class and extends animal class in child class 
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

class Cat extends Animal {

    void meow() {
        System.out.println("meowing...");
    }

}

public class Hierarchical {

    public static void main(String[] args) {
        Dog dogObject = new Dog();
        dogObject.bark();
        dogObject.eat();

        Cat catObject = new Cat();
        catObject.meow();
        catObject.eat();
    }

}
