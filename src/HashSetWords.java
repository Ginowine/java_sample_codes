import java.util.HashSet;
import java.util.Set;

public class HashSetWords {

    public static void main(String[] args){
        String[] nameArray = {"Gino", "Mark", "Brown", "Victor", "Victor", "Brown"};
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        for (String a : nameArray)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}
