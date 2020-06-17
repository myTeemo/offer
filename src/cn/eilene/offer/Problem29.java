package cn.eilene.offer;

/**
 * 面试题29. 顺时针打印矩阵
 */
public class Problem29 {

    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if (row == 0)
            return new int[0];
        int col = matrix[0].length;

        int[] result = new int[row * col];
        int top = 0;
        int left = 0;
        int right = col - 1;
        int down = row - 1;
        int x = 0;
        while (true) {
            // left -> right
            for (int i = left; i <= right; i++) result[x++] = matrix[top][i];
            if (++top > down) break;

            // top -> down
            for (int j = top; j <= down; j++) result[x++] = matrix[j][right];
            if (--right < left) break;

            // right -> left
            for (int k = right; k >= left; k--) result[x++] = matrix[down][k];
            if (--down < top) break;

            // down -> top
            for (int l = down; l >= top; l--) result[x++] = matrix[l][left];
            if (++left > right) break;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        Problem29 p29 = new Problem29();
        int[] result = p29.spiralOrder(matrix);
        System.out.println(result);
    }
}
