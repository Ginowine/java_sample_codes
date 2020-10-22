import java.util.*;

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

//THIS IS ANOTHER IMPLEMENTATION OF THE ABOVE CONCEPT
class Shuffle {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
