package Lab4_1.Lab4;

import java.util.Scanner;

public class ContDivideBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
    public static int count(int n){
        int a = 0;
        for (int i = 1;i <= n ;i++){
            if (i%3==0){
                a +=1;
            }
        }
        return a;
    }
}
