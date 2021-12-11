package Lab4_4.Lab4;

import java.util.Scanner;

public class ContainThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(containThreeNumber(a));
    }
    public static String containThreeNumber(int a){
        int b,x=0;
        for (int i=0;i >= 0;i++) {
            b = a % 10;
            a = a / 10;
            if (b == 3) {
                x++;
            }
        }
           if(x>0){
               return "contain 3";
           }else {
               return "not contain 3";
           }
        }
    }

