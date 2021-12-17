package Lab5_3.Lab5;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        CountStr obj = new CountStr();
        System.out.println(obj.countM(str));
    }
}

class CountStr {
    public int countM(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'M') {
                count++;
            }
        }
        return count;
    }
}