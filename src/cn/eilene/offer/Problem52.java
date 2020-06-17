package cn.eilene.offer;

/**
 * 面试题52. 两个链表的第一个公共节点
 */
public class Problem52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while (p != q) {
            p = p == null ? headB : p.next;
            q = q == null ? headA : q.next;
        }
        return p;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(0);
//        ListNode second = new ListNode(9);
//        headA.next = second;
//        ListNode third = new ListNode(1);
//        second.next = third;
//        ListNode fourth = new ListNode(2);
//        third.next = fourth;
//        ListNode fifth = new ListNode(4);
//        fourth.next = fifth;

        ListNode headB = new ListNode(1);
        headB.next = new ListNode(3);

        Problem52 p52 = new Problem52();
        ListNode res = p52.getIntersectionNode(headA, headB);
        System.out.println(res.val);
    }
}
