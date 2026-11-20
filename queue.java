import java.util.LinkedList;
import java.util.Queue;

public class queue {
    
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("a");
        q.add("a");
        q.add("b");
        q.add("c");
        System.out.println(q);

        q.poll();
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.isEmpty());

    }
}