package cn.eilene.offer;

/**
 * @Description 剑指Offer 面试题12. 矩阵中的路径
 * @Author MY-HE
 * @Date 2020-05-23 07:57
 */
public class Problem12 {
    public static void main(String[] args) {
        Problem12 mp = new Problem12();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'F'}};
        String word = "ABCCED";
        boolean res = mp.exist(board, word);
        System.out.println(res);
    }

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char[] words = word.toCharArray();
                boolean res = dfs(board, i, j, words, 0);
                if (res) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, char[] words, int k) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || k > words.length || board[i][j] != words[k])
            return false;
        if (k == words.length - 1) {
            return true;
        }
        char temp = words[k];
        board[i][j] = '/';
        boolean res = dfs(board, i - 1, j, words, k + 1) || dfs(board, i + 1, j, words, k + 1)
                || dfs(board, i, j - 1, words, k + 1) || dfs(board, i, j + 1, words, k + 1);
        board[i][j] = temp;
        return res;
    }
}
