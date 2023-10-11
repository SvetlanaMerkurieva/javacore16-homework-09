package mylinkedlist;
import java.util.*;

public class MyLinkedListResult {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("apple");
        list.add("lemon");
        list.add("orange");
        list.add("pineapple");

        System.out.println(list);
        System.out.println(list.size());


    }
}
