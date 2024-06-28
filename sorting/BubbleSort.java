package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 5, 1, 6, 7, 3};
        int tmp = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > numbers[i + 1]){
                // swapping the numbers
                tmp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = tmp;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
