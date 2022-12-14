/*
 * extends abstract method and override method from Shape abstract class 
 * and provide implementation in this Ractangle class
 */

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor() + "and area is : " + area();
    }

}
