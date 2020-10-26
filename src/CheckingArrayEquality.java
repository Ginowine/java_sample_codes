import java.util.Arrays;

public class CheckingArrayEquality {
    public static void main(String[] args){
        int[] arrayOne = new int[]{1, 5, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayTwo = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean which = Arrays.equals(arrayOne, arrayTwo);
        System.out.println(which);
    }
}
