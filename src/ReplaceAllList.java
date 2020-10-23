import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReplaceAllList {
    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        list.add("element 2");
        list.add("element 1");
        list.add("element 4");
        list.add("element 3");

        Collections.replaceAll(list, "element 3", "element 6");
        for (String str : list){
            System.out.println(str);
        }
    }
}
