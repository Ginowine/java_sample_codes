import java.util.Arrays;

public class FillingAnArray {
    public static void main(String[] args){
        int[] array = {1, 2, 3,4,5,6,7,8,8,9};
        Arrays.fill(array, 10);
//        System.out.println("Array completely filled" +
//                " with 10\n" + Arrays.toString(array));
        for (int a : array){
            System.out.println("Value = " + a);
        }

        fillASubArray(array, 1, 5, 6);


    }

    public static void fillASubArray(int[] in, int fromIndex, int toIndex, int value){
        Arrays.fill(in, fromIndex, toIndex, value);
        System.out.println(Arrays.toString(in));
    }
}
