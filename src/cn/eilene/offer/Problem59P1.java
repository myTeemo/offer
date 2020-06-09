package cn.eilene.offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description 面试题59 - I. 滑动窗口的最大值
 * @Author MY-HE
 * @Date 2020-06-09 14:51
 */
public class Problem59P1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            if (deque.peekFirst() == (i - k)) {
                deque.pollFirst();
            }
            if (i >= (k - 1)) {
                result[index++] = nums[deque.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Problem59P1 p59 = new Problem59P1();
        int[] r = p59.maxSlidingWindow(new int[]{1, -1}, 1);
        System.out.println("r = " + r);
    }
}
