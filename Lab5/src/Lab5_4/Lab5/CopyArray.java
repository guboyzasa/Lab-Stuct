package Lab5_4.Lab5;


import java.util.Scanner;
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr1[] = new int[num];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[arr1.length];
        copy(arr1, arr2);

    }

    public static void copy(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}

