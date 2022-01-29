package Lab6_5.Lab6;

import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayLst lst = new ArrayLst();
        lst.add(sc.nextInt());
        lst.add(sc.nextInt());
        lst.add(sc.nextInt());
        ArrayOpt obj = new ArrayOpt();
        System.out.println(obj.sumAll(lst));
    }
}
class ArrayOpt{
    public int sumAll(ArrayLst lst){

    }
}
class ArrayLst {

    public void add(int i, Object e) {

    }

    public void add(Object e) {

    }

    public Object get(int i) {

    }

    public int size() {

    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += elementData[i] + ",";
        }
        return str + "]";
    }
}


