package cn.eilene.offer;

/**
 * @Description 面试题17. 打印从1到最大的n位数
 * @Author MY-HE
 * @Date 2020-05-25 16:53
 */
public class Problem17 {
    public int[] printNumbers(int n) {
        int maxNum = (int) Math.pow(10, n) - 1;
        int[] res = new int[maxNum];
        for (int i = 1; i <= maxNum; i++) {
            res[i - 1] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        Problem17 pn = new Problem17();
        int[] result = pn.printNumbers(1);
        System.out.println(result.toString());
    }
}
