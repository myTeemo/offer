package cn.eilene.offer;

/**
 * 面试题66. 构建乘积数组
 */
public class Problem66 {
    public int[] constructArr(int[] a) {
        int l = a.length;
        if(l == 0 ){
            return new int[0];
        }
        int[] left = new int[l];
        int[] right = new int[l];
        int[] b = new int[l];
        left[0] = 1;
        for (int i = 1; i < l; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }
        right[l - 1] = 1;
        for (int i = l - 2; i >= 0; i--) {
            right[i] = right[i + 1] * a[i + 1];
        }
        for (int i = 0; i < l; i++) {
            b[i] = left[i] * right[i];
        }
        return b;
    }

    public static void main(String[] args) {
        Problem66 p66 = new Problem66();
        int[] res = p66.constructArr(new int[]{1, 2, 3, 4, 5});
        System.out.println("res = " + res);

    }
}
