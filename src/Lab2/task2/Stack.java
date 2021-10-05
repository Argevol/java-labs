package Lab2.task2;

public interface Stack<T> {
    void push(T value);
    T pop();

    T peek();
    int search(T value);
    void clear();

    boolean empty();
    int size();
}
