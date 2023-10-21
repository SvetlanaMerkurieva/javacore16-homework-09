package mystack;
import java.util.*;

public class MyStack <E> {
    private Object[] array;
    private int index;

    public MyStack() {
        array = new Object[10];
    }
    public void push(E value) {
        resize();

        array[index] = value;
        index++;
    }
    public void resize() {
        if (index == array.length) {
            int newSize = array.length * 2;
            Object[] newArray = new Object[newSize];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }
    public int size() {
        return index;
    }
    public void remove(int index) {
        if (array[index] == null) {
            throw new IndexOutOfBoundsException("Елементу з індексом " + index + " не існує");
        }
        Object[] newArray = new Object[array.length];
        int k = 0;
        for (int i = 0; i < this.index; i++) {
            if (i != index) {
                newArray[k] = array[i];
                k++;
            }
        }
        array = newArray;
        this.index = k;
    }
    public void clear() {
        array = new Object[10];
        index = 0;
    }
    public E peek() {
        return (E) array[index-1];
    }
    public void pop() {
        array = Arrays.copyOf(array, index-1);
        index = index - 1;
    }
    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < index; i++) {
            result.add(array[i].toString());
        }
        return "[" + result + "]";
    }
}
