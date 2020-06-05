package cn.eilene.offer;

/**
 * @Description 剑指Offer 面试题04. 二维数组中的查找
 * @Author MY-HE
 * @Date 2020-05-16 23:31
 */
public class Problem04 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {}
        };
        int target = 0;
        Problem04 rim = new Problem04();
        boolean res = rim.findNumberIn2DArray(matrix, target);
        System.out.println(res);
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        if (n == 0) {
            return false;
        }
        int m = matrix[0].length;
        if (m == 0) {
            return false;
        }
        int colEnd = m - 1;
        int rowEnd = n - 1;

        for (int i = 0; i < m; i++) {
            if (matrix[0][i] == target) {
                return true;
            }

            if (i + 1 < m && target > matrix[0][i] && target < matrix[0][i + 1]) {
                colEnd = i;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if (matrix[j][0] == target) {
                return true;
            }
            if (j + 1 < n && target > matrix[j][0] && target < matrix[j + 1][0]) {
                rowEnd = j;
                break;
            }
        }
        int begin = 0;
        for (int i = 0; i <= colEnd; i++) {
            if (matrix[rowEnd][i] == target) {
                return true;
            }
            if (i + 1 <= colEnd && matrix[rowEnd][i] < target && matrix[rowEnd][i + 1] > target) {
                begin = i + 1;
                break;
            }
        }
        for (int i = 0; i <= rowEnd; i++) {
            for (int j = begin; j <= colEnd; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
