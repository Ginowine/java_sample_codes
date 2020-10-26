import java.util.Arrays;

public class FillingAnArray {
    public static void main(String[] args){
        int[] array = {1, 2, 3,4,5,6,7,8,8,9};
        Arrays.fill(array, 10);
        System.out.println("Array completely filled" +
                " with 10\n" + Arrays.toString(array));
    }
}
