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

        System.out.println("Отримання елементу за індексом 1: " + myArrayListString.get(1));

        myArrayListString.remove(2);
        System.out.println("Видалення елементу з масиву: " + myArrayListString);

        myArrayListString.clear();
        System.out.println("Очищення масиву:");
        System.out.println("Mасив після очищення: " + myArrayListString);
        System.out.println("Розмір: " + myArrayListString.size());


        System.out.println("-------------------------------------------------");

        MyArrayList<Integer> myArrayListInteger = new MyArrayList<>();
        System.out.println("Результат роботи з типом int:");
        System.out.println("Створення масиву: " + myArrayListInteger);

        for (int i = 5; i < 12; i++) {
            myArrayListInteger.add(i);
        }
        System.out.println("Додавання елементів в масив: " + myArrayListInteger);

        System.out.println("Розмір масиву: " + myArrayListInteger.size());

        System.out.println("Отримання елементу за індексом 5: " + myArrayListInteger.get(5));
        System.out.println("Отримання елементу за індексом 7: " + myArrayListInteger.get(7));

        myArrayListInteger.remove(5);
        System.out.println("Видалення елементу з масиву: " + myArrayListInteger);

        myArrayListInteger.clear();
        System.out.println("Очищення масиву:");
        System.out.println("Mасив після очищення: " + myArrayListInteger);
        System.out.println("Розмір: " + myArrayListInteger.size());
    }
}
