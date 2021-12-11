package Lab5_1.Lab5;

public class DoubleArray {
    public static void main(String[] args) {
        DoubleArray s = new DoubleArray();
        int[]b = {1,2,4,};
        int[]c = s.copyArray(b);
        for (int i:c){
            System.out.println(i);
        }
    }
    private int[] copyArray(int arr[]) {
        int[] a = new int[arr.length*2];
        for (int i=0;i< arr.length;i++){
            a[i]=arr[i];
        }
        return a;

    }
}
