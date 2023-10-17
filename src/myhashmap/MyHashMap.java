package myhashmap;

import java.util.Objects;
import java.util.StringJoiner;

public class MyHashMap<K, V> {
    private int size;
    private Node<K, V> element;

    public void put(K key, V value) {
        Node<K, V> node = new Node<>();
        node.setKey(key);
        node.setValue(value);

        if (size == 0) {
            element = node;
            size++;
        } else {
            Node<K, V> last = element;
            if (!isKey(key)) {
                while (last.getNext() != null) {
                    last = last.getNext();
                }
                last.setNext(node);
                size++;
            }
        }
    }
    public void remove(int index) {
        Node<K, V> elementPrevDell = element;
        for (int i = 0; i < index-1; i++) {
            elementPrevDell = elementPrevDell.getNext();
        }
        Node<K, V> elementNextDell = element;
        for (int i = 0; i < index+1; i++) {
            elementNextDell = elementNextDell.getNext();
        }
        elementPrevDell.setNext(elementNextDell);
        size--;
    }
    public int size() { return size;}
    public void clear() {
        element = new Node<>();
        size = 0;
    }
    public V get(K key) {
        Node<K, V> search = element;
        for (int i = 0; i < size; i++) {
            if (!search.getKey().equals(key)) {
                search = search.getNext();
            }
        }
        return search.getValue();
    }
    public boolean isKey(K key) {
        Node<K, V> elementIsKey = element;
        for (int i = 0; i < size; i++) {
            if (elementIsKey.getKey().equals(key)) {
                return true;
            }
            elementIsKey = elementIsKey.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        Node<K, V> elementToString = element;
        StringJoiner result = new StringJoiner(", ");
        for (int i = 1; i <= size; i++) {
            result.add(elementToString.getKey().toString() + ": " + elementToString.getValue().toString());
            elementToString = elementToString.getNext();
        }
        return "[" + result + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(element.getKey(), element.getValue());
    }
    @Override
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyHashMap myHashMap = (MyHashMap) obj;
        return this.element.getKey() == myHashMap.element.getKey();
    }

}
