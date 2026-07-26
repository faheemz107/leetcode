
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode bucket=new ListNode(0);
        bucket.next= head;
        ListNode curr=bucket;
        while(curr.next !=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return bucket.next;   
    }
}