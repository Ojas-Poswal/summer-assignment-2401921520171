package Week3.Day2;

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
class Solution {
    public boolean isPalindrome(ListNode head) {

       if (head == null || head.next == null) return true;

        // 1. Find middle
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // 3. Compare
        ListNode left = head;
        ListNode right = prev;
        while (right != null) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }

        return true;
      



      /*  ListNode curr=head;
        ListNode temp = head;
        ListNode prev = null;
        ListNode forw = null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode slowTemp=null;
        while(fast.next!=null && fast!=null){
           slow=slow.next;
           fast=fast.next.next;
        }
        slowTemp=slow.next;
        while(slowTemp!=null){
            prev = slowTemp;
            slowTemp = slowTemp.next;
            forw=slowTemp.next;
            slowTemp.next=slow.next;;
            slow.next=temp;
            slowTemp=prev;
            prev.next=forw;
        }
        temp=slow.next;
        while(temp.next!=null){
            if(temp.val!=curr.val){
                return false;
            }
            temp=temp.next;
            curr=curr.next;
        }
        return true;*/
    }
}
