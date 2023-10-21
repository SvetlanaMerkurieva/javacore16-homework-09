package mylinkedlist;
import java.util.*;

public class MyLinkedListResult {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        System.out.println("Створення списку елементів: " + list);

        list.add("apple");
        list.add("lemon");
        list.add("orange");
        list.add("pineapple");
        System.out.println("Додали елементи: " + list);
        
        System.out.println("Розмір списку: " + list.size());

        System.out.println("Отримання елементу за індексом 1: " + list.get(1));
        System.out.println("Отримання елементу за індексом 4: " + list.get(4));

        list.remove(2);
        System.out.println("Cклад списку після видалення елементу під індексом 2: " + list + ", розмір: " + list.size());

        list.clear();
        System.out.println("Список після очищення: List: " + list + ", size: " + list.size());

    }
}
