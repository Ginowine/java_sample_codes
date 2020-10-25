import java.util.Arrays;

public class IterativeBinarySearch {
    public static void main(String[] args){

        int arrays[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arrays);
        int result = iterativeSearch(arrays, 10);
        System.out.println(result);
    }

    public static int iterativeSearch(int[] arrayToSearch, int element){
        int lowIndex = 0;
        int highIndex = arrayToSearch.length - 1;

        int elementsPosition = -1;

        while (lowIndex <= highIndex){
            int midIndex = (lowIndex + highIndex) / 2;
            if (element == arrayToSearch[midIndex]){
                elementsPosition = midIndex;
                break;
            }else if (element < arrayToSearch[midIndex]){
                highIndex = midIndex -1;
            }else if (element > arrayToSearch[midIndex]){
                lowIndex = midIndex+1;
            }
        }
        return elementsPosition;
    }
}
