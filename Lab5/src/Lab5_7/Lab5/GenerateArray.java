package Lab5_7.Lab5;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int save = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            arr[i] = save;
        }
        System.out.println(Arrays.toString(arr));
    }
}
