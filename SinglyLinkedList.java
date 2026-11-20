import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class SinglyLinkedList {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("First: ");
        int first = sc.nextInt();

        System.out.print("Second: ");
        int second = sc.nextInt();

        Node firstNode = new Node();
        firstNode.data = first;

        Node secondNode = new Node();
        secondNode.data = second;

        firstNode.next = secondNode;
        secondNode.next = null;

        Node temp = firstNode;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}