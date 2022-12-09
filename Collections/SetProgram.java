import java.util.*;

public class SetProgram {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Dipak");
        set.add("Ravi");
        set.add("Juned");

        System.out.println(set);
        for (String name : set) {
            System.out.println(name);
        }
    }
}
