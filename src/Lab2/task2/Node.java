package Lab2.task2;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(final T value){
        this.value = value;
    }

    public Node(final T value, final Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(final T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(final Node<T> next) {
        this.next = next;
    }
}
