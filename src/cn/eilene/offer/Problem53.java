package cn.eilene.offer;
/*
 * 面试题53 - II. 0～n-1中缺失的数字
 */
public class Problem53 {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 4, 5, 6, 7, 8, 9};
        Problem53 p53 = new Problem53();
        int res = p53.missingNumber(nums);
        System.out.println("res = " + res);
    }
}
