package CollectionFramework;
import java.util.*;
public class StackClass {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("After pop: " + stack);

        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());

        System.out.println("Contains 20: " + stack.contains(20));

        stack.push(50);
        System.out.println("After push: " + stack);

        System.out.println("Top element: " + stack.peek());

        for (int x : stack) {
            System.out.print(x + " ");
        }
        System.out.println();

        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        Iterator<Integer> reverseIt = stack.descendingIterator();
        while (reverseIt.hasNext()) {
            System.out.print(reverseIt.next() + " ");
        }
        System.out.println();

        stack.removeFirst();
        System.out.println("After removing top: " + stack);

        stack.removeFirstOccurrence(20);
        System.out.println("After removing 20: " + stack);

        stack.addFirst(100);
        stack.addLast(200);
        System.out.println("After addFirst and addLast: " + stack);

        System.out.println("First element: " + stack.peekFirst());
        System.out.println("Last element: " + stack.peekLast());

        System.out.println("Poll first: " + stack.pollFirst());
        System.out.println("Poll last: " + stack.pollLast());

        Deque<Integer> copy = new ArrayDeque<>(stack);
        System.out.println("Copied deque: " + copy);

        Integer[] arr = stack.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(arr));

        stack.clear();
        System.out.println("After clear: " + stack);
        System.out.println("Is empty: " + stack.isEmpty());
    }
}
