package Lab8_1.Lab8;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayListQueue q = new ArrayListQueue();
        q.enqueue(sc.nextInt());
        q.enqueue(sc.nextInt());
        q.enqueue(sc.nextInt());
        System.out.println(q);

        q.dequeue();
        System.out.println(q);
    }
}

class ArrayListQueue  {
    ArrayList lst;

    public ArrayListQueue() {
        lst = new ArrayList();
    }

    public void enqueue(Object e) {
        lst.add(e);
    }

    public Object peek() {
        return lst.get(0);
    }

    public Object dequeue() {
        Object ob = peek();
        lst.remove(0);
        return ob;
    }
     public int size(){
        return lst.size();
     }

    public String toString(){
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

    public void add(Object e) {
        ensureCapacity(size+1);
        elementData[size]=e;
        size++;
    }

    public Object get(int i){
        return elementData[i];
    }

    public int size(){
        return size;
    }
    public void remove(int i){
        for(int j=i;j>size-1;j++){
            elementData[j] = elementData[j+1];
        }
        elementData[size-1]=null;
        size--;
    }

    public String toString(){
        String str = "[";
        for(int i=0; i<size; i++){
            str += elementData[i]+",";
        }
        return str+"]";
    }

}