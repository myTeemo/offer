package cn.eilene.offer;

import java.util.ArrayList;
import java.util.List;

public class Problem22 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        List<ListNode> list = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            list.add(p);
            p = p.next;
        }
        return list.get(list.size() - k);
    }

    public static void main(String[] args) {
        Problem22 p22 = new Problem22();
        ListNode head = p22.new ListNode(1);
        ListNode second=p22.new ListNode(2);
        head.next=second;
        ListNode third=p22.new ListNode(3);
        second.next=third;
        ListNode fourth=p22.new ListNode(4);
        third.next=fourth;
        ListNode fifth=p22.new ListNode(5);
        fourth.next=fifth;
        ListNode kthFromEnd = p22.getKthFromEnd(head, 2);
        System.out.println(kthFromEnd.val);

    }
}
