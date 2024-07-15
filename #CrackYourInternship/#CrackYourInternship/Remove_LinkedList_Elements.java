class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        ListNode curr = head;
        ListNode prev = dummy;
        dummy.next = head;
        while(curr!=null){
            if(curr.val == val){
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
            curr = curr.next;
        }return dummy.next;
    }
}