package cn.eilene.offer;

/**
 * @Description 面试题42. 连续子数组的最大和
 * @Author MY-HE
 * @Date 2020-05-31 21:21
 */
public class Problem42 {
    public int maxSubArray(int[] nums) {
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] = nums[i - 1] + nums[i];
            }
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Problem42 p42 = new Problem42();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("p42.maxSubArray(nums) = " + p42.maxSubArray(nums));
    }
}
