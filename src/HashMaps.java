import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Hello");
        hmap.put(2, "Welcome");
        hmap.put(3, "Hola");
        hmap.put(4, "Hello");
        //enhanced  for loop
        for(Integer key: hmap.keySet()){
            String value=hmap.get(key);
            System.out.println("Key =" + key + ", value = " + value);
        }
    }
}
