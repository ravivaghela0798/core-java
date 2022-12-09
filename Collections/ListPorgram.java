import java.util.*;
import java.util.stream.Collectors;

public class ListPorgram {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi Vaghela");
        list.add("Dipak Paramar");
        list.add("Juned Davda");

        System.out.println(list);
        for (String name : list) {
            System.out.println(name);
        }

        List<Character> list2 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'A', 'C', 'E', 'E', 'E'));
        // list2.add('A');
        // list2.add('B');
        // list2.add('C');
        // list2.add('D');
        // list2.add('A');
        // list2.add('C');
        // list2.add('E');
        // list2.add('E');
        // list2.add('E');
        System.out.println(list2);
        List<Character> newList = list2.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);
    }
}