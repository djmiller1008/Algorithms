public class deleteMiddleNode {
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(five);

        one.printLinkedList();

        deleteMiddle(three);
        System.out.println("");

        one.printLinkedList();

    }

    public static void deleteMiddle(Node n) {
        // set current node equal to next node
        n.data = n.next.data;

        // now delete next node 
        n.next = n.next.next;
    }
}


// singly linked list
public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    public void setNext(Node n) {
        next = n;
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