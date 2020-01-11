package algoexpert.easy;

import algoexpert.common.util.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class ReverseSingleLinkedListTest {


    private ReverseSingleLinkedList reverseSingleLinkedList = Mockito.mock(ReverseSingleLinkedList.class);

    @Before
    public void setup(){
        System.out.println(reverseSingleLinkedList);
    }
    @Test
    public void testCase1(){

        reverseSingleLinkedList.reverseLinkedList(null);
    }

    @Test
    public void testCase2(){
        Node node = new Node(1);
        reverseSingleLinkedList.reverseLinkedList(node);
    }

    @Test
    public void testCase3(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.setNext(node2);
        node2.setNext(node3);
        Node result = ReverseSingleLinkedList.reverseLinkedList(node1);
        Assert.assertTrue(result.getData() == 3);
        Assert.assertTrue(result.getNext().getData() == 2);
        Assert.assertTrue(result.getNext().getNext().getData() == 1);
    }

    @Test
    public void testCase4(){
        Node createdList = CreateLikedList.createLikedList(new int[]{0,1,2,3,4,5,6,6,7,8,9});
        Node node = ReverseSingleLinkedList.reverseLinkedList(createdList);
        ArrayList<Integer> result =CreateLikedList.toArrayList(node);
        int expected[] = new int[]{9,8,7,6,5,4,3,2,1,0};
        Assert.assertEquals(result,expected);
    }


    public static class CreateLikedList {
        public static Node createLikedList(int[] arr){
            Node head = new Node(0);
            for (int i=1; i< arr.length;i++){
                Node tail = new Node(i);
                head.setNext(tail);
            }
            return head;
        }
        public static ArrayList<Integer> toArrayList(Node head){
            ArrayList<Integer> list = new ArrayList<Integer>();
            while (head != null){
                list.add(head.getData());
                head = head.getNext();
            }
            return list;
        }
    }

}
