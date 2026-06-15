package Week3.Day1;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Q1_CycleLL {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            temp=temp.next;
            fast=fast.next.next;
             if(temp==fast){
               return true;
             }
        }
       
        return false;
    }
}
