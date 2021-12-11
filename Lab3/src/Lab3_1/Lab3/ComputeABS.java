package Lab3_1.Lab3;

import java.util.Scanner;

public class ComputeABS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(compute(a,b));
    }
    public static int compute(int a, int b){
        int abs = a-b;
        if(abs < 0){
            abs = abs*-1;
        }
        return abs;
    }
}

