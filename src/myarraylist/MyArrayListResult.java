package myarraylist;
import java.util.*;

public class MyArrayListResult {
    public static void main(String[] args) {
        MyArrayList<String> myArrayListString = new MyArrayList<>();
        System.out.println("Результат роботи з типом String:");
        System.out.println("Створення масиву: " + myArrayListString);

        myArrayListString.add("pen");
        myArrayListString.add("pencil");
        myArrayListString.add("book");
        System.out.println("Додавання елементів в масив: " + myArrayListString);

        System.out.println("Розмір масиву: " + myArrayListString.size());

        System.out.println("-------------------------------------------------");

        MyArrayList<Integer> myArrayListInteger = new MyArrayList<>();
        System.out.println("Результат роботи з типом int:");
        System.out.println("Створення масиву: " + myArrayListInteger);

        for (int i = 5; i < 10; i++) {
            myArrayListInteger.add(i);
        }
        System.out.println("Додавання елементів в масив: " + myArrayListInteger);

        System.out.println("Розмір масиву: " + myArrayListInteger.size());




    }
}
