package myarraylist;
import java.util.*;

public class MyArrayList <E> {
    private Object[] array;
    private int index;
    public MyArrayList(){
        array = new Object[10];
    }
    public void  add (E value) {
        resize();

        array[index] = value;
        index++;
    }
    private void resize() {
        if (index == array.length) {
            int newSize = array.length * 2;
            Object[] newArray = new Object[newSize];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }
    public void remove(int index) {
        if (array[index] == null) {
            throw new IndexOutOfBoundsException("Елементу з індексом " + index + " не існує");
        }
        Object[] newArray = new Object[this.index];
        int k = 0;
        for (int i = 0; i < this.index; i++ ) {
            if (i != index) {
                newArray[k] = array[i];
                k++;
            }
        }
        array = newArray;
        this.index = k;
    }

    public int size() {
        return index;
    }
    public E get (int index) {
        if (array[index] == null) {
            String message = "Елементу з індексом " + index + " не існує";
            return (E) message;
        }
        return (E) array[index];
    }
    public void clear() {
        array = new Object[10];
        index = 0;
    }
    public String message() {
            return "Елементу з індексом " + index + " не існує";
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
