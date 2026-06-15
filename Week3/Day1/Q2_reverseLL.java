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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        ListNode forw=null;
        ListNode prev=null;
        
        while(temp.next!=null){
          prev = temp; //setting prev as temp;
          temp=temp.next;//incrementing temp;
          forw=temp.next;//next node to temp;
          temp.next=head;//sending current node to point at head
          prev.next=forw;//making the prev node point to next
          head=temp; // setting temp as new head
          temp=prev;//taking temp at where prev node is for next number
          
        }
        return head;
    }
}
