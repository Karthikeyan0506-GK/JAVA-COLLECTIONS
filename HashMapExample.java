import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

map.put("Karthi",22);

map.put("dhilipan",22);

map.put("joel",23);

System.out.println("HasMap:"+map);
System.out.println("Age of karthi:"+map.get("karthi"));
map.remove("Dhilip");
System.out.println("After Removing Dhilip:"+map);



    }
}
