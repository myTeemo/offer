package cn.eilene.offer;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 面试题30. 包含min函数的栈
 */
public class Problem30 {

    private Deque<Integer> stack;
    private int minValue;

    public Problem30() {
        stack = new LinkedList<>();
        minValue = Integer.MAX_VALUE;
    }

    public void push(int x) {
        stack.add(x);
        if (x < minValue) {
            minValue = x;
        }
    }

    public void pop() {
        int removedValue = stack.removeLast();
        if (removedValue == minValue) {
            minValue = Integer.MAX_VALUE;
            Iterator<Integer> iterator = stack.iterator();
            while (iterator.hasNext()) {
                int val = iterator.next();
                if (val < minValue) {
                    minValue = val;
                }
            }
        }

    }

    public int top() {
        return stack.getLast();
    }

    public int min() {
        return minValue;
    }
}
