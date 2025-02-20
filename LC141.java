
import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
    public ListNode next(){
        return this.next;
    }
}

public class LC141 {
    public static void main(String[] args) {
        //141 linkedlist cycle using floyd algo
        ListNode head = new ListNode(0, head);

        System.out.println(hasCycle(head));

    }
    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next() == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next() != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}
