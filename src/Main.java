import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (Integer i: array1) {
            sum += i;
        }
        int averageValue = sum / array1.length;
        System.out.println("Average value of array is: " + averageValue);

        // Task 2
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {6,7,8,9,10};
        int mergedLength = array2.length + array3.length;
        int[] mergedArray = new int[mergedLength];
        int position = 0;
        for (Integer i: array2) {
            mergedArray[position] = i;
            position++;
        }
        for (Integer i: array3) {
            mergedArray[position] = i;
            position++;
        }
        System.out.println("Merged array: " + Arrays.toString(mergedArray));

        // Task 3
        int biggestNumber = mergedArray[0];
        for (Integer i: mergedArray) {
            if (i > biggestNumber) {
                biggestNumber = i;
            }
        }
        System.out.println("The biggest number is: " + biggestNumber);

        // Task 4
        int[] unsortedArray = {25, 12, 64, 9, 8, 11, 6, 2};
        Arrays.sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
}