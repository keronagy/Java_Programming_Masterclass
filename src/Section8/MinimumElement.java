package Section8;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.close();
        return count;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:\r");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
