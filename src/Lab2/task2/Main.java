package Lab2.task2;

public class Main {
    public static void main(final String[] args) {
        try {
            final Stack<Integer> stack = new LinkedList<>();

            System.out.println("Is a stack empty? " + stack.empty());

            stack.push(3);
            stack.push(54);

            stack.push(-9);
            stack.push(-12);
            stack.push(0);
            stack.push(7);

            System.out.println("Is a stack empty? " + stack.empty());

            System.out.println("Size of stack: " + stack.size());
            System.out.println("Element found in position: " + stack.search(-12));
            System.out.println("Top element: " + stack.peek());

            stack.clear();
            System.out.println("Stack was cleared");
            System.out.println("Is a stack empty? " + stack.empty());

            stack.push(5);
            stack.push(-18);
            stack.push(6);

            while (!stack.empty()) {
                System.out.println("Removed element: " + stack.pop() + " ");
            }

            final IterableLinkedList<String> iterableStack = new IterableLinkedList<>();

            System.out.println("Is a stack empty? " +  iterableStack.empty());

            iterableStack.push("iterator");
            iterableStack.push( "the");
            iterableStack.push("Testing");

            System.out.println("Is a stack empty? " +  iterableStack.empty());

            System.out.println("Size of stack: " +  iterableStack.size());
            System.out.println("Element found in position: " +  iterableStack.search("iterator"));
            System.out.println("Top element: " +  iterableStack.peek());

            for(final String value : iterableStack){
                System.out.println(value);
            }
        } catch (final RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}
