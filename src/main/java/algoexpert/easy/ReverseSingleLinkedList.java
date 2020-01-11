package algoexpert.easy;

import algoexpert.common.util.Node;

public class ReverseSingleLinkedList {
    public static Node reverseLinkedList(Node head){
        if (head == null) return null;
        if (head.getNext() == null) return head;

        Node prev = null;
        Node curr = head;

        while (curr != null){
            Node next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
