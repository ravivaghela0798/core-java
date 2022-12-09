import java.util.*;
import java.util.stream.Collectors;

/*
 * List Program for creating Arraylist and Add data and iterate Arraylist and print values 
 */

public class ListPorgram {

    public static void main(String[] args) {
        ArrayList<String> personList = new ArrayList<>();
        personList.add("Ravi Vaghela");
        personList.add("Dipak Paramar");
        personList.add("Juned Davda");

        System.out.println(personList);
        for (String name : personList) {
            System.out.println(name);
        }

        List<Character> characterList = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'A', 'C', 'E', 'E', 'E'));

        System.out.println(characterList);
        List<Character> uniqueCharacterList = characterList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueCharacterList);
    }

}