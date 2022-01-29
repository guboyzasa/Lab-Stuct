package Lab6_4.Lab6;

import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayLst lst = new ArrayLst();
        lst.add(sc.nextInt());
        lst.add(sc.nextInt());
        lst.add(sc.nextInt());
        System.out.println(lst.get(0));
        System.out.println(lst.size());
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
            Object[] arr = new Object[s];
            for (int i = 0; i < elementData.length; i++) {
                arr[i] = elementData[i];
            }
            elementData = arr;
        }
    }

    public void add(Object e) {
        ensureCapacity(size + 1);
        elementData[size] = e;
        size++;
    }

    public Object get(int i) {
        return elementData[i];
    }

    public int size() {
        return size;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += elementData[i] + ",";
        }
        return str + "]";
    }
}

