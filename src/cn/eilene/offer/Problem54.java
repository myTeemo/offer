package cn.eilene.offer;

/**
 * @Description 面试题54. 二叉搜索树的第k大节点
 * @Author MY-HE
 * @Date 2020-06-05 17:17
 */
public class Problem54 {
    private int j, k;
    private int res;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;

    }

    public void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        j++;
        if (j == k) {
            res = root.val;
        }

        dfs(root.left);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);
        TreeNode lr = new TreeNode(2);
        root.left = left;
        root.right = right;
        left.right = lr;
        Problem54 p54 = new Problem54();
        p54.kthLargest(root, 4);

    }
}
