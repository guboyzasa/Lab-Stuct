package Lab3_3.Lab3;

import java.util.Scanner;

public class ModNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%5==0&&n>=1000){
            System.out.println("In condition");
        }else {
            System.out.println("Out of condition");
        }
    }
}
