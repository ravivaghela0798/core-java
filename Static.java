/*
 * program to demonstrate static methods, variables, and blocks
 */

public class Static {

    int id;
    String name;
    static String college = "HNGU";

    {
        System.out.println("Static block called...");
    }

    static String getName(String name) {
        System.out.println(name);
        return name;
    }

    Static(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void result() {
        System.out.println(id + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Static staticObject1 = new Static(1, "Ravi Vaghela");
        Static staticObject2 = new Static(2, "Deipak Parmar");
        staticObject1.result();
        staticObject2.result();
        Static.getName("Juned");
    }

}
