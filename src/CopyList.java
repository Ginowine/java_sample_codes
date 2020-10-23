import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CopyList {
    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        list.add("element 2");
        list.add("element 1");
        list.add("element 4");
        list.add("element 3");

        List<String> destList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            destList.add("");
        }
        Collections.copy(destList, list);
        System.out.println(destList);
    }
}
