class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
       Node zero_head = new Node(-1);
       Node one_head = new Node(-1);
       Node two_head = new Node(-1);
       Node zero_tail = zero_head;
       Node one_tail = one_head;
       Node two_tail = two_head;
       Node temp = head;
       while(temp!=null){
           if(temp.data == 0){
                   zero_tail.next = temp;
                   zero_tail = zero_tail.next;
               }
           else if(temp.data == 1){
                   one_tail.next = temp;
                   one_tail = one_tail.next;
           }else{
                    two_tail.next = temp;
                    two_tail = two_tail.next;
           }
           temp = temp.next;
           
       }
       zero_tail.next = (one_head.next!=null)?(one_head.next):(two_head.next);
       one_tail.next  = two_head.next;
       two_tail.next  = null;
       
       return zero_head.next;
    }
}
