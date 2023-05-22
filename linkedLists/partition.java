import algorithms.linkedLists.Node;

public class partition {

    public static void main(String[] args) {
        Node linkedListHead = new Node(3);
        linkedListHead.appendToTail(5);
        linkedListHead.appendToTail(8);
        linkedListHead.appendToTail(5);
        linkedListHead.appendToTail(10);
        linkedListHead.appendToTail(2);
        linkedListHead.appendToTail(1);

        linkedListHead.printLinkedList();
        System.out.println("");
        Node newHead = part(linkedListHead, 5);
        newHead.printLinkedList();
        

    }

    public static Node part(Node node, int x) {
        Node beforeHead = null;
        Node beforeEnd = null;
        Node afterHead = null;
        Node afterEnd = null;

        
        while (node != null) {
            Node next = node.getNext();
            if (node.getData() < x) {
                if (beforeHead == null) {
                    beforeHead = node;
                    beforeEnd = beforeHead;
                } else {
                    beforeEnd.setNext(node);
                    beforeEnd = node;
                }
            } else {
                if (afterHead == null) {
                    afterHead = node;
                    afterEnd = afterHead;
                } else {
                    afterEnd.setNext(node);
                    afterEnd = node;
                    afterEnd.setNext(null);
                }
            }
            node = next;
        }

        if (beforeHead == null) {
            return afterHead;
        }

        beforeEnd.setNext(afterHead);
        return beforeHead;
        
    }
}
