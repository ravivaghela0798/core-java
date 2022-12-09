import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Comparater program for sorting object by any proprerty from the object using Comparator interface 
 */

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
    public int compare(Person personObject1, Person personObject2) {
        return personObject1.age - personObject2.age;
    }

}

class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person personObject1, Person personObject2) {
        return personObject1.name.compareTo(personObject2.name);
    }
}

public class ComparatorProgram {

    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Vaghela Ravi", 24));
        personList.add(new Person("Paramr Dipak", 23));
        personList.add(new Person("Davda Juned", 23));

        System.out.println("Person List as it is : " + personList);
        Collections.sort(personList, new AgeComparator());
        System.out.println("Sorting by Age : " + personList);
        Collections.sort(personList, new NameComparator());
        System.out.println("Sorting by Name" + personList);
    }

}
