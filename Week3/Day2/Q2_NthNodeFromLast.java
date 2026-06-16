
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode prev = null;
        int count=0;
        if(head==null || head.next==null){
            return null;
        }
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==n){
            head=head.next;
            return head;
        }
        temp = head;
        int pos = count-n+1;
        for(int i=1;i<pos;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next = temp.next;
        temp.next=null;
        return head;
    }
}