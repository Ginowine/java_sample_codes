import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort {
    public static void main(String[] args){
        // this is one way to sort a list
//        List<String> list = Arrays.asList(args);
//        Collections.sort(list);
//        System.out.println(list);


        //This is another way to sort a list
        List<String> list1 = new LinkedList<>();
        list1.add("element 2");
        list1.add("element 1");
        list1.add("element 4");
        list1.add("element 3");

        Collections.sort(list1);
        for (String s : list1){
            System.out.println(" sort elements in ascending order  --" + s);
        }
    }
}
