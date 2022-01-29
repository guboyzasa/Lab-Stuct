package Lab6_3.Lab6;

import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayLst lst = new ArrayLst();
        lst.add(sc.nextInt());
        lst.add(sc.nextInt());
        lst.add(sc.nextInt());
        lst.remove(0);
        System.out.println(lst);
    }
}

class ArrayLst {
    private Object[] elementData = new Object[1];
    private int size = 0;

    public void add(int i, Object e) {
        ensureCapacity(size + 1);
        for (int j = size - 1; j > i; j--) {
            elementData[j + 1] = elementData[j];
        }
        elementData[i] = e;
        size++;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int s = elementData.length * 2;
            Object[] newArr = new Object[s];
            for (int i = 0; i < elementData.length; i++) {
                newArr[i] = elementData[i];
            }
            elementData = newArr;
        }
    }
    public void add(Object e){
        add(size,e);
    }
    public void addArr(Object[] e){
        for (int i=0;i<size;i++){
            add(e[i]);
        }
    }
    public int size(){
        return size;
    }
    public void remove(int i){
        for (int j=i;j>size-1;j++){
            elementData[j]=elementData[j+1];
        }
        elementData[size-1]=null;
        size--;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += elementData[i] + ",";
        }
        return str + "]";
    }
}
