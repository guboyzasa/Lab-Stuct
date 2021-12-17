package Lab5_2.Lab5;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        GenArray obj = new GenArray();
        int data5[] = obj.data5(0);
        System.out.println(Arrays.toString(data5));
    }
}

class GenArray {
    public int[] data5(int n) {
        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i];
        }
        return arr;
    }
}