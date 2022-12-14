/*
 * extends shape abstract method and override method from Shape abstract class 
 * and provide implementation in this Circle class
 */

class Circle extends Shape {

    double radius;

    Circle(String color, double radius) {
        super(color);
        System.out.println("Circle Constructor called...");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor() + "and area is : " + area();
    }

}
