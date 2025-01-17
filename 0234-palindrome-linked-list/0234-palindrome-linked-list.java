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
    public ListNode findMiddle(ListNode head)
    {
        ListNode ptr1=head;
        ListNode ptr2=head;
        while(ptr2.next!=null && ptr2.next.next!=null)
        {
            ptr2=ptr2.next.next;
            ptr1=ptr1.next;
        }
        return ptr1;
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }


    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        {
            return true;
        }
        ListNode middle= findMiddle(head);
        ListNode secondHalfStart=reverse(middle.next);
        ListNode frstHalf=head;
        while(secondHalfStart!=null)
        {
            if(frstHalf.val!=secondHalfStart.val)
            {
                return false;
            }
            frstHalf=frstHalf.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }
}