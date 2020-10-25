import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FrequencyOfElementInList {

    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        list.add("element 2");
        list.add("element 1");
        list.add("element 1");
        list.add("element 4");

        int number = Collections.frequency(list, "element 2");
        System.out.println(number);

        List<String> list2 = new LinkedList<>();
        list2.add("element 5");
        list2.add("element 6");
        list2.add("element 7");
        list2.add("element 8");

        System.out.println(Collections.disjoint(list, list2));
    }
}
