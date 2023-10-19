package mylinkedlist;

import java.util.LinkedList;
import java.util.StringJoiner;

public class MyLinkedList <E> {
    private int size = 0;
    private Node<E> elementFirst;
    private Node<E> elementLast;

    public void add (E value) {
        Node<E> node = new Node<>();
        node.setValue(value);

        if (size == 0) {
            elementFirst = node;
            elementLast = node;
        } else {
            Node<E> last = elementFirst;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(node);
            elementLast = node;
            elementLast.setPrev(last);
        }
        size++;
    }
    public int size() {
        return size;
    }
    public void clear() {
        elementFirst = null;
        elementLast = null;
        size = 0;
    }
    public E get(int index) {
        Node<E> search = elementFirst;
            for (int i = 0; i < index; i++) {
                search = search.getNext();
            }
        return search.getValue();
    }
    public void remove(int index) {
        Node<E> elementPrevDell = elementFirst;
        for (int i = 0; i < index-1; i++) {
            elementPrevDell = elementPrevDell.getNext();
        }
        Node<E> elementNextDell = elementFirst;
        for (int i = 0; i < index+1; i++) {
            elementNextDell = elementNextDell.getNext();
        }
        elementPrevDell.setNext(elementNextDell);
        size--;
    }
    @Override
    public String toString() {
        Node<E> elementToString = elementFirst;
        StringJoiner result = new StringJoiner(", ");
        for (int i = 1; i <= size; i++) {
            result.add(elementToString.getValue().toString());
            elementToString = elementToString.getNext();
        }
        return "[" + result + "]";
    }
}


