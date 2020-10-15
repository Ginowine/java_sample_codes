import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArray {
    public static void main(String[] args){
        String[] nameArray = {"Gino", "Mark", "Brown", "Victor"};

        List<String> name = Arrays.asList(nameArray);
        Collections.sort(name);
        System.out.println(name);
    }
}
