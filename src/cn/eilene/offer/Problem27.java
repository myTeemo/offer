package cn.eilene.offer;

/**
 * @Description 面试题27. 二叉树的镜像
 * @Author MY-HE
 * @Date 2020-05-27 08:42
 */
public class Problem27 {

    public TreeNode mirrorTree(TreeNode root) {
        exchange(root);
        return root;
    }

    public void exchange(TreeNode root) {
        if (root != null) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = right;
            root.right = left;
            exchange(root.left);
            exchange(root.right);
        }
    }

    public static void main(String[] args) {
        Problem27 p27 = new Problem27();
        TreeNode root = new TreeNode(4);
        TreeNode secondLeftRoot = new TreeNode(2);
        TreeNode secondRightRoot = new TreeNode(7);
        root.left = secondLeftRoot;
        root.right = secondRightRoot;

        TreeNode thirdLeftLeftRoot = new TreeNode(1);
        TreeNode thirdLeftRightRoot = new TreeNode(3);
        secondLeftRoot.left = thirdLeftLeftRoot;
        secondLeftRoot.right = thirdLeftRightRoot;

        TreeNode thirdRightLeftRoot = new TreeNode(6);
        TreeNode thirdRightRightRoot = new TreeNode(9);
        secondRightRoot.left = thirdRightLeftRoot;
        secondRightRoot.right = thirdRightRightRoot;

        p27.mirrorTree(root);
    }
}
