package cn.eilene.offer;

/**
 * 剑指Offer 面试题21. 调整数组顺序使奇数位于偶数前面
 */
public class Problem21 {
    public int[] exchange(int[] nums) {
        int p = 0;
        int q = nums.length - 1;
        // 收尾双指针法
        while (p <= q) {
            boolean flag = true;
            if (nums[p] % 2 == 1) {
                p++;
                flag = false;
            }
            if (nums[q] % 2 == 0) {
                q--;
                flag = false;
            }
            if (flag) {
                int t = nums[p];
                nums[p] = nums[q];
                nums[q] = t;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Problem21 p21 = new Problem21();
        p21.exchange(nums);
        System.out.println(nums);
    }
}
