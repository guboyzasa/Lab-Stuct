package Lab5_6.Lab5;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum(arr);
        }
        System.out.println(sum);
    }

    public static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 5) {
                sum += arr[i];
            }
        return sum;
    }
}