package cn.eilene.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 面试题61. 扑克牌中的顺子
 * @Author MY-HE
 * @Date 2020-06-10 09:21
 */
public class Problem61 {
    public boolean isStraight(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num == 0)
                continue;
            if (set.contains(num))
                return false;
            set.add(num);
            if (num > maxValue)
                maxValue = num;
            if (num < minValue)
                minValue = num;
        }
        if (maxValue - minValue < 5)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Problem61 p61 = new Problem61();
        boolean res = p61.isStraight(new int[]{0, 0, 1, 2, 5});
        System.out.println("res = " + res);
    }
}
