/*
 * create Animal Parent class and extend in one child class 
 * that child class extend in another child class and accessing property
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

class BabyDog extends Dog {

    void weep() {
        System.out.println("weeping...");
    }

}

public class Multilevel {

    public static void main(String args[]) {
        BabyDog babyDogObject = new BabyDog();
        babyDogObject.weep();
        babyDogObject.bark();
        babyDogObject.eat();
    }

}
