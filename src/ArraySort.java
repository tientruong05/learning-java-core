import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] number = {6, 8, 4, 9, 3, 3, 20, 46};

        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }

        System.out.println("Array sort: " + Arrays.toString(number));
    }
}
