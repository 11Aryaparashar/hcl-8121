package CollectionFramework;
import java.util.*;
public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Mango", 150);

        System.out.println(map.get("Apple"));

        if (map.containsKey("Banana")) {
            System.out.println("Found banana");
        }

        map.remove("Mango");

        System.out.println(map.size());

        for (String s : map.keySet()) {
            System.out.println(s + " : " + map.get(s));
        }
    }
}
