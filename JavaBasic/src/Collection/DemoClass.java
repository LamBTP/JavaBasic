package Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoClass {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");

        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap);
    }
}
