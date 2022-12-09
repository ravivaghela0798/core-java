import java.util.ArrayList;

public class ListPorgram {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Ravi Vaghela");
        list.add("Dipak Paramar");
        list.add("Juned Davda");

        System.out.println(list);
        for (String name : list) {
            System.out.println(name);
        }
    }
}
