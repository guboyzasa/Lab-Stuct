package Lab3_2.Lab3;

import java.util.Scanner;

public class BetweenValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(compute(a));
    }
    public static String compute(int a){
        if(a <= 100) {
            return "Between 10 to 100";
            } else {
            return "Out of condition";
            }
        }
    }
