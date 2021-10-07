package Lab2.task2;

import java.util.EmptyStackException;

public class LinkedList<T> implements Stack<T> {
    protected Node<T> top;

    public LinkedList() {
        this.top = null;
    }

    public LinkedList(final Node<T> top) {
        this.top = top;
    }

    @Override
    public void push(final T value) {
        final Node<T> topPointer = new Node<T>(value);
        topPointer.setNext(top);
        top = topPointer;
    }

    @Override
    public T pop() throws RuntimeException{
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }

        final Node<T> topPointer = top;
        top = topPointer.getNext();
        return topPointer.getValue();
    }

    @Override
    public T peek() throws RuntimeException {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }

        return top.getValue();
    }

    @Override
    public int search(final T value) throws RuntimeException {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }

        Node<T> topPointer = top;

        int pos = 1;
        while (topPointer != null) {
            if (topPointer.getValue() == value) {
                return pos;
            } else {
                pos++;
                topPointer = topPointer.getNext();
            }
        }
        return -1;
    }

    @Override
    public void clear() throws RuntimeException {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }

        top = null;
    }

    @Override
    public boolean empty() {
        return top == null;
    }

    @Override
    public int size() throws RuntimeException {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }

        Node<T> topPointer = top;

        int length = 0;
        while (topPointer != null) {
            topPointer = topPointer.getNext();
            length++;
        }
        return length;
    }
}
