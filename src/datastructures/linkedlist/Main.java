
// THIS GOES IN YOUR MAIN CLASS TO TEST YOUR CODE:
// -----------------------------------------------

package datastructures.linkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1
            
            Linked List:
            4

        */

    }

}
