package Lab4_3.Lab4;

import java.util.Scanner;

public class ProductBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(compute(a,b));
    }
    public static int compute(int a, int b) {
        int i = 1;
        for (i = a+1;i <= b;i++) {
            a *= i;
        }
        return a;
    }
}
