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
    public int size() {
        return index;
    }
    public E get (int index) {
        return (E) array[index];
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
