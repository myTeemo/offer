package cn.eilene.offer;

/**
 * @Description 面试题39. 数组中出现次数超过一半的数字
 * 摩尔投票法
 * @Author MY-HE
 * @Date 2020-05-29 22:27
 */
public class Problem39 {
    public int majorityElement(int[] nums) {
        int tickets = 0;
        int x = 0;
        for (int num : nums) {
            if (tickets == 0) {
                x = num;
            }
            tickets += num == x ? 1 : -1;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        Problem39 p39 = new Problem39();
        int res = p39.majorityElement(nums);
        System.out.println(res);
    }
}
