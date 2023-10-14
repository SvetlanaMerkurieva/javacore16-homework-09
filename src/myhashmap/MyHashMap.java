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
        } else {
            Node<K, V> last = element;
            for (int i = 0; i < size; i++) {
                if (!last.getKey().equals(key) || last.getNext() != null) {
                    last = last.getNext();
                }
            }
            last.setNext(node);
        }
        size++;
    }
    public int size() { return size;}
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