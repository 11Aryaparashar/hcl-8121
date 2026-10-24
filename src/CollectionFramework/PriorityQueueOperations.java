package CollectionFramework;
import java.util.PriorityQueue;

public class PriorityQueueOperations {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("Priority Queue: " + pq);

        pq.offer(5);
        System.out.println("After insertion: " + pq);

        System.out.println("Highest Priority Element: " + pq.peek());

        System.out.println("Removed Element: " + pq.poll());
        System.out.println("After removal: " + pq);

        System.out.println("Contains 20: " + pq.contains(20));

        System.out.println("Size: " + pq.size());

        System.out.println("Is Empty: " + pq.isEmpty());

        System.out.println("Elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

