package Lab5_5.Lab5;

import java.util.Scanner;
import java.util.Arrays;

public class ShiftArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(shiftRight(arr)));
    }

    public static int[] shiftRight(int arr[]) {
        int arrShiftRight[] = new int[arr.length + 1];
        for (int i = 0; i < arrShiftRight.length; i++) {
            if (i == 0) {
                arrShiftRight[i] = 0;
            } else {
                arrShiftRight[i] = arr[i - 1];
            }
        }
        return arrShiftRight;
    }
}
