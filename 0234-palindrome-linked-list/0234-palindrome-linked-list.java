
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       ListNode prev=null;
       ListNode curr=slow;
       while(curr!=null){
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
       }
        ListNode fir=head;
        ListNode sec=prev;
        while(sec!=null){
            if(fir.val!=sec.val){
                return false;
            }
         fir=fir.next;
         sec=sec.next;
        }
        return true;
    }
}
