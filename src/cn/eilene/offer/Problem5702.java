package cn.eilene.offer;

import java.util.ArrayList;

/**
 * 面试题57 - II. 和为s的连续正数序列
 * 题解思路：滑动窗口
 */
public class Problem5702 {

    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> result = new ArrayList<>();
        int left, right;
        left = 1;
        right = 2;
        while (left < right) {
            int sum = (left + right) * (right - left + 1) / 2;
            if (right > target / 2 + 1)
                break;
            if (sum < target) {
                right++;
            } else if (sum > target) {
                left++;
            } else {
                int[] r = new int[right - left + 1];
                for (int i = 0; i < right - left + 1; i++) {
                    r[i] = left + i;
                }
                result.add(r);
                left++;
            }
        }
        int[][] res = new int[0][];
        return result.toArray(res);
    }

    public static void main(String[] args) {
        Problem5702 p5702 = new Problem5702();
        int[][] sequences = p5702.findContinuousSequence(15);
    }
}
