class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person p) {
        if (age == p.age) {
            return 0;
        } else if (age > p.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class ComparableProgram {
    public static void main(String args[]) {
        ArrayList<Person> al = new ArrayList<Person>();
        al.add(new Person("Ravi", 24));
        al.add(new Person("Dipak", 23));
        al.add(new Person("Juned", 23));

        Collections.sort(al);
        for (Person p : al) {
            System.out.println(p.name + " " + p.age);
        }
    }
}
