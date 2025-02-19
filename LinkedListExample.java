import java.util.LinkedList;

public class LinkedListExample{
    public static void main(String[] args) {
        LinkedList<String> students=new LinkedList<>();

students.add("anbu");
students.add("adhi");
students.add("baba");
students.add("gowtham");

System.out.println("LinkedList:"+ students);
students.addFirst("Dhilip");
System.out.println("Adding Dhilip:"+ students);
students.addLast("karthi");
System.out.println("adding Karthi:"+ students);




    }
}
