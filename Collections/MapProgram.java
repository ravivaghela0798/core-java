import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("First Name", "Ravi");
        map.put("Last Name", "Vaghela");
        System.out.println(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
    }
}
