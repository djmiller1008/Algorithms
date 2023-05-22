public class kthToLastElement {
    
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

        kthToLastEle(linkedListHead, 2);


    }

    public static void kthToLastEle(Node head, int k) {
        Node n = head;
        int length = 0;
        while (n != null) {
            n = n.next;
            length++;
        }

        n = head;
        
        int elementIndex = length - k - 1;
       
        for (int i = 0; i <= elementIndex; i++) {
            n = n.next;
        }
        System.out.println(n.data);
        
    }
}


// singly linked list
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