package Lab7_1.Lab7;

import java.util.Scanner;

public class ArrayListStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayListSt st = new ArrayListSt();
        st.push(sc.nextInt());
        st.push(sc.nextInt());
        st.push(sc.nextInt());
        System.out.println(st);

        st.pop();
        System.out.println(st);
    }
}

class ArrayListSt {
    public ArrayList lst;

    public ArrayListSt() {
        lst = new ArrayList();
    }

    public void push(Object e) {
        lst.add(e);
    }

    public Object peek() {
        return lst.get(lst.size() - 1);
    }

    public Object pop() {
        Object obj = peek();
        lst.remove(lst.size()-1);
        return obj;
    }
    public String toString() {
        return lst.toString();
    }
}

class ArrayList {
    private Object [] elementData = new Object[1];
    private int size = 0;

    public void add(int i, Object e){
        ensureCapacity(size+1);
        for(int j=size-1;j>i;j--){
            elementData[j+1]=elementData[j];
        }
        elementData[i]=e;
        size++;
    }
    private void ensureCapacity(int capacity){
        if(capacity>elementData.length){
            int s = elementData.length*2;
            Object [] newArr = new Object[s];
            for (int i=0;i<elementData.length;i++){
                newArr[i]=elementData[i];
            }
            elementData = newArr;
        }
    }
    public void add(Object e){
        ensureCapacity(size+1);
        elementData[size]=e;
        size++;
    }

    public Object get(int i) {
        return elementData[i];
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

