import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FrequencyOfElementInList {

    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        list.add("element 2");
        list.add("element 1");
        list.add("element 1");
        list.add("element 3");

        int number = Collections.frequency(list, "element 2");

        System.out.println(number);
    }
}
