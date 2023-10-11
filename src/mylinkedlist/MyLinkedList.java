package mylinkedlist;

import java.util.LinkedList;
import java.util.StringJoiner;

public class MyLinkedList <E> {
    private int size = 0;
    private Node<E> element;

    public void add (E value) {
        Node<E> node = new Node<>();
        node.setValue(value);

        if (size == 0) {
            element = node;
        } else {
            Node<E> last = element;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(node);
        }
        size++;
    }
    public int size() {
        return size;
    }
    public void clear() {
        element = null;
        size = 0;
    }
    public E get(int index) {
        Node<E> search = element;
        if (search == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        for (int i = 0; i < index; i++) {
            search = search.getNext();

            if (search == null) {
                throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
            }
        }
        return search.getValue();
    }
    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 1; i <= size; i++) {
            result.add(element.getValue().toString());
            element = element.getNext();
        }
        return "[" + result + "]";
    }
}


