package cn.eilene.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description LeetCode 46. 全排列
 * @Author MY-HE
 * @Date 2020-05-23 17:07
 */
public class LeetCode46 {
    private List<List<Integer>> res = new ArrayList<>();
    private boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        generatePermute(nums, 0, new ArrayList<>());
        System.out.println(res);
        return res;
    }

    public void generatePermute(int[] nums, int index, List<Integer> p) {
        if (index == nums.length) {
            res.add(new ArrayList<>(p));
//            System.out.println(p);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!this.used[i]) {
                p.add(nums[i]);
                used[i] = true;
                generatePermute(nums, index + 1, p);
                p.remove(p.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        LeetCode46 p = new LeetCode46();
        int[] nums = {1, 2, 3};
        p.permute(nums);
    }
}
