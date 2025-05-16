package codekata;

public class Node {
    int data;
    Node next = null;

    Node(final int data) {
        this.data = data;
    }

    public static Node push(final Node head, final int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static Node buildOneTwoThree() {
        Node head = null;
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node myList = buildOneTwoThree();
        printList(myList);
    }
}

