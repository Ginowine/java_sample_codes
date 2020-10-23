import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseListAlgorithm {

    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        list.add("element 2");
        list.add("element 1");
        list.add("element 4");
        list.add("element 3");

        Collections.sort(list);
        for(String str : list){
            System.out.println(" sort elements in ascending order  --" + str);
        }

        Collections.reverse(list);
        for (String str : list){
            System.out.println(" reverse order of list --" + str);
        }
    }
}
