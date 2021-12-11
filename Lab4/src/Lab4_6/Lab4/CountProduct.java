package Lab4_6.Lab4;

import java.util.Scanner;

public class CountProduct {
    public static void main(String[] args) {
        System.out.println(count());
    }
    public static int count() {
        Scanner sc = new Scanner(System.in);
        int price,sum=0;
        for (int i = 0; i >= 0; i++) {
            price= sc.nextInt();
            if (price > 10) {
                sum+=1;
            }else if(price==-1){
                break;
            }
        }
        return sum;
    }
}