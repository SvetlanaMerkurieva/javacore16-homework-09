package mylinkedlist;

public class MyLinkedList <E> {
    private Node<E> element;

    public void add (E value) {
        Node<E> node = new Node<>();
        node.setValue(value);

        if (element == null) {
            element = node;
        } else {
            Node<E> lastElement = element;
            while (lastElement.getNext() != null) {
                lastElement = lastElement.getNext();
            }
            lastElement.setNext(node);
        }

    }

}
