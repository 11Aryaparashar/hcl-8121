package CollectionFramework;
import java.util.*;

public class QueueClass {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.offer(4);
        System.out.println(q);
        q.offer(1);
        System.out.println(q);
        System.out.println(q.poll());
    }
}
