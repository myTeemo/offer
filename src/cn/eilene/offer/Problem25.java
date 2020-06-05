package cn.eilene.offer;

/**
 * @Description 面试题25. 合并两个排序的链表
 * @Author MY-HE
 * @Date 2020-05-27 08:17
 */
public class Problem25 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                p.next = l2;
                break;
            }
            if (l2 == null) {
                p.next = l1;
                break;
            }
            if (l1.val <= l2.val) {
                p.next = l1;
                p = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                p = l2;
                l2 = l2.next;
            }
        }
        return head.next;
    }

    public static void main(String[] args) {
        Problem25 p25 = new Problem25();
        ListNode l1Head = p25.new ListNode(1);
        ListNode l1Second = p25.new ListNode(2);
        l1Head.next = l1Second;
        ListNode l1Third = p25.new ListNode(4);
        l1Second.next = l1Third;

        ListNode l2Head = p25.new ListNode(1);
        ListNode l2Second = p25.new ListNode(3);
        l2Head.next = l2Second;
        ListNode l2Third = p25.new ListNode(4);
        l2Second.next = l2Third;
        p25.mergeTwoLists(l1Head, l2Head);
        System.out.println("end");
    }
}
