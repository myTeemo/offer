package cn.eilene.offer;

/**
 * @Description 面试题53 - I. 在排序数组中查找数字 I
 * @Author MY-HE
 * @Date 2020-06-03 22:33
 */
public class Problem53 {
    public int search(int[] nums, int target) {
        int p = 0;
        int q = nums.length - 1;
        while (p <= q) {
            int middle = (p + q) / 2;
            if (nums[middle] < target) {
                p = middle + 1;
            } else if (nums[middle] > target) {
                q = middle - 1;
            } else {
                if (nums[p] < target) {
                    p++;
                }
                if (nums[q] > target) {
                    q--;
                }
                if (nums[p] == target && nums[q] == target) {
                    break;
                }
            }
        }
        return q - p + 1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        Problem53 p53 = new Problem53();
        int res = p53.search(nums, target);
        System.out.println("res = " + res);
    }
}
