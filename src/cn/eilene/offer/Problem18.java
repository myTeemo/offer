package cn.eilene.offer;

public class Problem18 {

    public ListNode deleteNode(ListNode head, int val) {
        ListNode p = head;
        ListNode q;
        if (p.val == val) {
            if (p.next == null) {
                head = null;
            } else {
                head = p.next;
            }
            return head;
        }

        if (p.next != null) {
            q = p.next;
            while (q != null) {
                if (q.val == val) {
                    p.next = q.next;
                    q = null;
                    break;
                } else {
                    p = q;
                    q = q.next;
                }
            }
            return head;
        } else {
            return head;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

        Problem18 p18 = new Problem18();
        ListNode head = p18.new ListNode(4);
        ListNode first = p18.new ListNode(5);
        head.next = first;
        ListNode second = p18.new ListNode(1);
        first.next = second;
        ListNode third = p18.new ListNode(9);
        second.next = third;

        ListNode res = p18.deleteNode(head, 5);
        System.out.println(res);
    }
}
