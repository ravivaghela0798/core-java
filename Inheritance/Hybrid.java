interface Male {
    void show();
}

interface Female {
    void show();
}

class HumanBody {
    public void displayHuman() {
        System.out.println("Method defined inside HumanBody class");
    }
}

public class Hybrid extends HumanBody implements Male, Female {
    public static void main(String[] args) {
        Hybrid obj = new Hybrid();
        obj.show();
        obj.displayChild();
    }

    public void show() {
        System.out.println("Implementation of show() method defined in interfaces Male and Female");
    }

    public void displayChild() {
        System.out.println("Method defined inside Child class");
    }
}
