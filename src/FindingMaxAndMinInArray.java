public class FindingMaxAndMinInArray {
    public static void main(String[] args){

        int[] array = new int[] {1, 3, 5, 4, 7, 20};

        int maxValue = getMax(array);
        System.out.println("Maximum value in the array: " + maxValue);

        int minValue = getMin(array);
        System.out.println("Minimum value in the array: " + minValue);
    }

    public static int getMax(int[] number){
        int max = number[0];

        for (int i = 1; i < number.length; i++){
            if (number[i] > max){
                max = number[i];
            }
        }
        return max;
    }

    public static int getMin(int[] numbers){
        int min = numbers[0];
        for (int i= 1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
}
