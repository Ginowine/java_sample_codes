import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleList {

    public static void main(String[] args){

        int[] data = {2, 4, 3, 1, 6, 8, 5};
        List<Integer> list = new ArrayList<Integer>();
        for (int a : data){
            list.add(a);
            Collections.shuffle(list, new Random());
            System.out.println(list);
        }
    }
}
