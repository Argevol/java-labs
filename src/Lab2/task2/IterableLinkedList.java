package Lab2.task2;

import java.util.Iterator;

public class IterableLinkedList<T> extends LinkedList<T> implements Iterable<T> {
    public IterableLinkedList() {
        super();
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>();
    }

    public class LinkedListIterator<T> implements Iterator<T> {
        Node<T> next = (Node<T>) top;

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public T next() {
            final T value = next.getValue();
            next = next.getNext();
            return value;
        }
    }
}
