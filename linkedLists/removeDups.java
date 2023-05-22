package algorithms.linkedLists;

import java.util.ArrayList;

public class removeDups {
    
    public static void main(String[] args) {
        Node linkedListHead = new Node(1);
        linkedListHead.appendToTail(2);
        linkedListHead.appendToTail(8);
        linkedListHead.appendToTail(3);
        linkedListHead.appendToTail(8);
        linkedListHead.appendToTail(6);
        linkedListHead.appendToTail(10);
        linkedListHead.appendToTail(4);
        linkedListHead.appendToTail(10);
        linkedListHead.appendToTail(8);

    
        linkedListHead.printLinkedList();

        removeDuplicates(linkedListHead);
      
        System.out.println("");

        linkedListHead.printLinkedList();
    }

    public static void removeDuplicates(Node head) {
        ArrayList<Integer> values = new ArrayList<>();

        Node n = head;
        while (n != null) {
            if (values.contains(n.data)) {
                n.deleteNode(head, n.data);
            } else {
                values.add(n.data);
            }
            n = n.next;
        }
    }
}

public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    public void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public Node deleteNode(Node head, int d) {
        Node n = head;

        if (n.data == d) {
            return head.next;
        }

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    public void printLinkedList() {
        Node n = this;

        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

}
