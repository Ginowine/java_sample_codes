import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args){
        Set<String> h = new HashSet<String>();

        h.add("India");
        h.add("Australia");
        h.add("Nigeria");
        h.add("India");

        System.out.println(h);

        h.remove("Australia");
        System.out.println("Set after removing " + "Australia:" + h);

        System.out.println("Iterating over set:");

        Iterator<String> i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
