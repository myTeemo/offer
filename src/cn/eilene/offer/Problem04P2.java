package cn.eilene.offer;

/**
 * @Description 剑指Offer 面试题04. 二维数组中的查找
 * @Author MY-HE
 * @Date 2020-05-16 23:31
 */
public class Problem04P2 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 31;
        Problem04P2 rim = new Problem04P2();
        boolean res = rim.findNumberIn2DArray(matrix, target);
        System.out.println(res);
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int c = m - 1;
        int r = 0;
        while (true) {
            if (c < 0 || r < 0 || c >= m || r >= n) {
                return false;
            }
            if (matrix[r][c] == target) {
                return true;
            }
            if (matrix[r][c] > target) {
                c--;
            } else {
                if (matrix[r][c] < target) {
                    r++;
                }
            }
        }
    }
}
