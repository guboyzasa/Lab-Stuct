package Lab4_7.Lab4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isPrime(a));
    }
    public static String isPrime(int a){
        int x = 2;
        for (int i = 0; i<a;i++){
            if ((a%x)==0){
                break;
            }x++;
        }if (x==a){
            return "prime";
        }else {
            return "not prime";
        }
    }
}
