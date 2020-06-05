package cn.eilene.offer;

/**
 * @Description 面试题11. 旋转数组的最小数字
 * @Author MY-HE
 * @Date 2020-05-22 07:46
 */
public class Problem11 {
    public static void main(String[] args) {
        Problem11 wa = new Problem11();
        int res = wa.minArray(new int[]{3, 3, 1, 3,3,3,3,3});
        System.out.println(res);
    }

    public int minArray(int[] numbers) {
        int begin = 0;
        int end = numbers.length - 1;

        if (numbers[begin] < numbers[end]) {
            return numbers[begin];
        }
        while (begin < end) {
            int mid = (begin + end) / 2;

            if (numbers[mid] < numbers[end])
                end = mid;
            else if (numbers[mid] > numbers[end])
                begin = mid + 1;
            else
                end -= 1;
        }
        return numbers[end];
    }
}
