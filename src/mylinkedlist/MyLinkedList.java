package mylinkedlist;

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
    @Override
    public String toString() {
        if (element == null) {
            return "Список порожній";
        }
        StringJoiner result = new StringJoiner(", ");
        for (int i = 1; i <= size; i++) {
            result.add(element.getValue().toString());
            element = element.getNext();
        }
        return "[" + result + "]";
    }
}


