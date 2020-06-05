package cn.eilene.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @Description TODO
 * @Author MY-HE
 * @Date 2020-05-18 10:40
 */
public class ReversePrint {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ReversePrint rp = new ReversePrint();
        ListNode head = rp.new ListNode(1);
        ListNode second = rp.new ListNode(3);
        head.next = second;
        ListNode third = rp.new ListNode(2);
        third.next = null;
        second.next = third;
//        int[] ints = rp.reversePrint(head);
        int[] ints = rp.reversePrint2(head);
        System.out.println(ints);
    }

    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode l;
        l = head;
        while (l != null) {
            list.add(l.val);
            l = l.next;
        }
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] reversePrint2(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode l = head;
        while (l != null) {
            stack.push(l.val);
            l = l.next;
        }
        int[] res = new int[stack.size()];
        int i = 0;
        while (!stack.empty()) {
            res[i] = stack.pop();
            i++;
        }
        return res;
    }
}
