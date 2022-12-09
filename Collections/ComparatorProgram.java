import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}

class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }

}

class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }

}

public class ComparatorProgram {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Vaghela Ravi", 24));
        list.add(new Person("Paramr Dipak", 23));
        list.add(new Person("Davda Juned", 23));

        System.out.println("Person List as it is : " + list);
        Collections.sort(list, new AgeComparator());
        System.out.println("Sorting by Age : " + list);
        Collections.sort(list, new NameComparator());
        System.out.println("Sorting by Name" + list);
    }
}
