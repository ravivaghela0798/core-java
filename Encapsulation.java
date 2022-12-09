/*
 * program to demonstrate encapsulation.
 */

public class Encapsulation {

    private String name;

    // set to value in name
    public void setName(String name) {
        this.name = name;
    }

    // get value by getname
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Encapsulation encapsulationObject = new Encapsulation();
        encapsulationObject.setName("Ravi Vaghela");
        System.out.println(encapsulationObject.getName());
    }

}
