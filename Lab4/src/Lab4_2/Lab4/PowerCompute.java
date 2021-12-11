package Lab4_2.Lab4;

import java.util.Scanner;

public class PowerCompute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(compute(a,b));
    }
    public static int compute(int a, int b ) {
        int sum1 = 1, sum2 =1;
        for (int i=1;i<=a;i++){
            sum1 *= 5;
        }
        for (int i=1;i<=b;i++){
            sum2 *= 3;
        }
        return sum1+sum2;
    }
}
