package Lab2.task2;

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
    public T pop() throws NullPointerException {
        if (empty()) {
            throw new NullPointerException("Stack is empty");
        }

        final Node<T> topPointer = top;
        top = topPointer.getNext();
        return topPointer.getValue();
    }

    @Override
    public T peek() throws NullPointerException {
        if (empty()) {
            throw new NullPointerException("Stack is empty");
        }

        return top.getValue();
    }

    @Override
    public int search(final T value) throws NullPointerException {
        if (empty()) {
            throw new NullPointerException("Stack is empty");
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
    public void clear() throws NullPointerException {
        if (empty()) {
            throw new NullPointerException("Stack is empty");
        }

        while (top != null) {
            final Node<T> topPointer = top;
            top = topPointer.getNext();
        }

    }

    @Override
    public boolean empty() {
        return top == null;
    }

    @Override
    public int size() throws NullPointerException {
        if (empty()) {
            throw new NullPointerException("Stack is empty");
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
