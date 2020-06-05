package cn.eilene.offer;
import java.util.Stack;

/**
 * @Description 剑指Offer 面试题09. 用两个栈实现队列
 * 题解思路：s1只负责进栈，s2只负责出栈，当s2为空栈时，才需要将s1的数据放入到s2中，当s1也为空栈时，返回-1
 * @Author MY-HE
 * @Date 2020-05-21 09:32
 */
public class Problem09 {
    Stack<Integer> s1, s2;

    public Problem09() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}
