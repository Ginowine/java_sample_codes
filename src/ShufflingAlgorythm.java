import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ShufflingAlgorythm {
    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        list.add("element 2");
        list.add("element 1");
        list.add("element 4");
        list.add("element 3");

        // randomly permutes the elements in a List.
        Collections.shuffle(list);
        for (String str : list) {
            System.out.println(" Shuffling elements in ascending order  --" + str);
        }
    }
}
