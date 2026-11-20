import java.util.ArrayDeque;

public class DequeExample {
    
    public static void main(String[] args) {

        ArrayDeque<Integer> q = new ArrayDeque<>();

        q.addFirst(10);
        q.addLast(20);
        q.addLast(30);

        System.out.println(q);

        q.removeFirst();
        q.removeLast();

        System.out.println(q);
    }
}