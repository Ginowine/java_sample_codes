import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleList {

    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        for (String a : args){
            list.add(a);
            Collections.shuffle(list, new Random());
            System.out.println(list);
        }
    }
}
