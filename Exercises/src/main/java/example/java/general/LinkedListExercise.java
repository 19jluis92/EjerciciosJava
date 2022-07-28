package example.java.general;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class LinkedListExercise {



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1.next != null){
            addTwoNumbers(l1.next,l2);
        }
        else if(l2.next != null){
            ListNode temp = addTwoNumbers(l1,l2.next);
            int arrange = temp.val % 10;
            l1.val  = l1.val + l2.val + arrange;
        }
        else{
            l1.val+= l2.val;
            return l1;
        }
        return l1;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(7,new ListNode(2,new ListNode(4,new ListNode(3))));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));

        LinkedListExercise listexercise = new LinkedListExercise();
        listexercise.addTwoNumbers(l1,l2);
        System.out.println("yolo");
    }
}
