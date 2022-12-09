/*
 * This is Main class for creating object and get output
 */

public class Main {

    public static void main(String[] args) {
        Shape circleShape = new Circle("Red", 2.2);
        Shape rectangleShape = new Rectangle("Yellow", 2, 4);

        System.out.println(circleShape.toString());
        System.out.println(rectangleShape.toString());
    }

}
