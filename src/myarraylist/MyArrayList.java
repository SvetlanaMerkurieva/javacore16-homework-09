package myarraylist;
import java.util.*;

public class MyArrayList <E> {
    private E value;
    private E[] array;

    public E[]  add (E value, E[] array) {
        E[] newArray = Arrays.copyOf(array, array.length+1);
        newArray[array.length] = value;
        return newArray;
    }
}
