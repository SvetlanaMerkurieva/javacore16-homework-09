package myqueue;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyQueue<E> {
    private Object[] array;
    private int size;

    public MyQueue() {
        array = new Object[10];
    }
    public void add(E value) {
        resize();

        array[size] = value;
        size++;
    }
    public void resize() {
        if (size == array.length) {
            int newSize = array.length * 2;
            Object[] newArray = new Object[newSize];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }
    public int size() {
        return size;
    }

    public void clear() {
        array = new Object[10];
        size = 0;
    }
    public E peek() {
        return (E) array[0];
    }
    public void poll() {
        Object[] newArray = new Object[array.length-1];
        System.arraycopy(array, 1, newArray, 0, array.length-1);
        array = newArray;
        size = size - 1;
    }
    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < size; i++) {
            result.add(array[i].toString());
        }
        return "[" + result + "]";
    }
}
