package cn.eilene.offer;

/**
 * @Description 剑指offer 面试题03. 数组中重复的数字
 * @Author MY-HE
 * @Date 2020-05-16 22:58
 */
public class Problem03 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1};
        Problem03 rn = new Problem03();
        int res = rn.findRepeatNumber(nums);
        System.out.println(res);
    }

    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int m = nums[i];
            if (m == nums[m] && i != m) {
                return m;
            } else {
                if (m == i) {
                    i++;
                } else {
                    int t = nums[m];
                    nums[m] = m;
                    nums[i] = t;
                }
            }
        }
        return nums[0];
    }
}
