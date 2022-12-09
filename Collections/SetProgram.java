import java.util.*;

/*
 * Set program for create HashSet Object and add data and iterate one by one value and print
 */

public class SetProgram {

    public static void main(String[] args) {
        Set<String> nameSet = new HashSet<>();
        nameSet.add("Dipak");
        nameSet.add("Ravi");
        nameSet.add("Juned");

        System.out.println(nameSet);
        for (String name : nameSet) {
            System.out.println(name);
        }
    }

}
