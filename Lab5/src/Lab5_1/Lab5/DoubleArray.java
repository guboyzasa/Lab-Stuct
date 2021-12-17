package Lab5_1.Lab5;
import java.util.Scanner;
import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        DoubleArrayCopy obj = new DoubleArrayCopy();
        int arrayCopy[] = obj.copyArray(arr);
        System.out.println(Arrays.toString(arrayCopy));
    }
}
    class DoubleArrayCopy{
        public int[] copyArray(int arr[]){
           int newArray[] = new int[arr.length*2];
            for (int i=0;i<arr.length;i++){
                newArray[i]= arr[i];
        }
            return newArray;
        }
    }

