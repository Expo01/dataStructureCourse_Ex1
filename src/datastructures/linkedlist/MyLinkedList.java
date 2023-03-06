package datastructures.linkedlist;


import org.w3c.dom.Node;

public class MyLinkedList {

    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //

    private Node head;
    private Node tail;
    private int length;

    class Node{ // node has value and a Node as a pointer
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public MyLinkedList (int value){  //constructor creates new Node and pointer to the new node. sets head and tail
        // node fields to new node.
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}
