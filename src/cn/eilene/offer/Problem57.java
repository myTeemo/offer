package cn.eilene.offer;

public class Problem57 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (right == left) {
            return new int[0];
        }
        while (right > left) {
            if (nums[right] + nums[left] > target) {
                right--;
            } else if (nums[right] + nums[left] < target) {
                left++;
            } else {
                break;
            }
        }
        return new int[]{nums[left], nums[right]};
    }

    public static void main(String[] args) {
        Problem57 p57 = new Problem57();
        int[] result = p57.twoSum(new int[]{10, 26, 30, 31, 47, 60}, 40);
        System.out.println("result = " + result.toString());
    }
}
