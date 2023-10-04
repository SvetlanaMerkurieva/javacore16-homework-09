package myarraylist;
import java.util.*;

public class MyArrayListResult {
    public static void main(String[] args) {
        String[] items = {"pen", "pencil", "note", "book"};
        String item = "paper";

        Integer[] numbers = {10, 15, 8, 2};
        Integer number = 12;

        MyArrayList<String> myArrayListString = new MyArrayList<>();
        String[] arrayString = myArrayListString.add(item, items);

        MyArrayList<Integer> myArrayListInteger = new MyArrayList<>();
        Integer[] arrayInteger = myArrayListInteger.add(number, numbers);

        System.out.println("Результат роботи методу add:");
        System.out.println("Початковий масив строк:" + Arrays.toString(items));
        System.out.println("Результат додавання:" + Arrays.toString(arrayString));
        System.out.println("Початковий масив чисел:" + Arrays.toString(numbers));
        System.out.println("Результат додавання:" + Arrays.toString(arrayInteger));

    }
}
