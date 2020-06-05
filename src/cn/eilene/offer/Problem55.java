package cn.eilene.offer;

/**
 * @Description 面试题55 - I. 二叉树的深度
 * @Author MY-HE
 * @Date 2020-06-05 17:38
 */
public class Problem55 {
    private int max;

    public int maxDepth(TreeNode root) {
        dfs(root, 1);
        return max;
    }

    public void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth > max) max = depth;
        dfs(root.left, ++depth);
        --depth;
        dfs(root.right, ++depth);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Problem55 p55 = new Problem55();
        p55.maxDepth(root);
        System.out.println("p55.max = " + p55.max);
    }
}
