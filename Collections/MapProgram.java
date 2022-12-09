import java.util.*;

/*
 * map program to create Map object, add key and value in Hashmap and iterate one by one value
 * and get value by getValue() method
 */

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("First Name", "Ravi");
        nameMap.put("Last Name", "Vaghela");

        System.out.println(nameMap);
        for (Map.Entry<String, String> entry : nameMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
