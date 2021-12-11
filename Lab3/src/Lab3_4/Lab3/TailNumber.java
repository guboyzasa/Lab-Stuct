package Lab3_4.Lab3;

import java.util.Scanner;

public class TailNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(compute(a));
    }
    public static String compute(int a){
        if (a%10==0||a%10==1||a%10==2||a%10==3||a%10==4){
            return "Lower";
        }else {
            return "Upper";
        }
    }
}
