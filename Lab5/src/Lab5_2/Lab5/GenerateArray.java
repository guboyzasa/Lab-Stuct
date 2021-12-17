package Lab5_2.Lab5;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        GenArray obj = new GenArray();
        System.out.println(Arrays.toString(obj.data5(num)));
    }
}

class GenArray {
    public int[] data5(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }
        return arr;
    }
}