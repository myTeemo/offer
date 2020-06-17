package cn.eilene.offer;

public class Problem24 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        // 没有节点 或者 只有一个节点
        if (head == null || head.next == null) {
            return head;
        }
        // 两个节点的情况
        if (head.next.next == null) {
            ListNode p = head.next;
            p.next = head;
            head.next = null;
            return p;
        }

        // 三个节点及以上的情况
        ListNode p = head;
        ListNode q = p.next;
        p.next = null;
        ListNode r;
        while (q != null) {
            r = q.next;
            q.next = p;
            p = q;
            q = r;
        }
        return p;
    }

    public static void main(String[] args) {
        Problem24 p24 = new Problem24();
        ListNode head = p24.new ListNode(1);
        ListNode second = p24.new ListNode(2);
        head.next = second;
        ListNode third = p24.new ListNode(3);
        second.next = third;
        ListNode fourth = p24.new ListNode(4);
        third.next = fourth;
        ListNode fifth = p24.new ListNode(5);
        fourth.next = fifth;
        p24.reverseList(head);
        System.out.println("end");
    }
}
