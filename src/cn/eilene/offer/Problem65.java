package cn.eilene.offer;

/**
 * 面试题65. 不用加减乘除做加法
 */
public class Problem65 {
    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Problem65 p65 = new Problem65();
        int res = p65.add(3, 11);
        System.out.println("res = " + res);
    }
}
