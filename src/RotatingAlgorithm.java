import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RotatingAlgorithm {

    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        list.add("element 2");
        list.add("element 1");
        list.add("element 4");
        list.add("element 3");

        Collections.sort(list);
        for (String s : list){
            System.out.println(" sort elements in ascending order  --" + s);
        }

        Collections.rotate(list, 2);
        for (String s : list){
            System.out.println(" rotated elements  --" + s);
        }
    }
}
