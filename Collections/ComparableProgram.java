import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
        // if (age == person.age) {
        //     return 0;
        // } else if (age > person.age) {
        //     return 1;
        // } else {
        //     return -1;
        // }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class ComparableProgram {
    public static void main(String args[]) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Ravi", 24));
        list.add(new Person("Dipak", 23));
        list.add(new Person("Juned", 23));

        System.out.println(list);
        Collections.sort(list);
        for (Person person : list) {
            System.out.println(person.name + " " + person.age);
        }
    }
}
