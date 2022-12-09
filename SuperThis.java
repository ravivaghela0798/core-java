class Super {
    int a = 50;
    int b = 100;
}

public class SuperThis extends Super {
    void res() {
        int a = 1000;
        int b = 5000;
        System.out.println(super.a);
        System.out.println(a);
        System.out.println(super.b);
        System.out.println(b);
    }

    public static void main(String[] args) {
        new SuperThis().res();
    }
}
