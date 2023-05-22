package algorithms.linkedLists;

// singly linked list
public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        next = n;
    }

    public void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.getNext() != null) {
            n = n.getNext();
        }
        n.setNext(end);
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
            System.out.println(n.getData());
            n = n.getNext();
        }
    }

}
