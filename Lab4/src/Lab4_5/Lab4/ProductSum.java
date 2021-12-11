package Lab4_5.Lab4;

import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static int sum(){
        Scanner sc = new Scanner(System.in);
        int x,sum=0;
        for (int i = 0;i>=0;i++){
            x = sc.nextInt();
            if (x!=-1){
                sum+=x;
            }else {
                break;
            }
        }
        return sum;
    }
}
