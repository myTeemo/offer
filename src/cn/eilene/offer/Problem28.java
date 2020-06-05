package cn.eilene.offer;

/**
 * @Description 面试题28. 对称的二叉树
 * @Author MY-HE
 * @Date 2020-05-27 09:11
 */
public class Problem28 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isEqual(root.left, root.right);
    }
    public boolean isEqual(TreeNode left, TreeNode right) {
        boolean res = false;

        if (left == null && right == null) {
            res = true;
        }
        if (left != null && right != null && left.val == right.val) {
            res = isEqual(left.left, right.right);
            if (res) {
                res = isEqual(left.right, right.left);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode secondLeft = new TreeNode(3);
        TreeNode secondRight = new TreeNode(3);
        root.left = secondLeft;
        root.right = secondRight;
        TreeNode thirdLeftLeft = new TreeNode(4);
        TreeNode thirdLeftRight = new TreeNode(5);
        secondLeft.left = thirdLeftLeft;
        secondLeft.right = thirdLeftRight;
//        TreeNode thirdRightLeft = new TreeNode(4);
        TreeNode thirdRightRight = new TreeNode(4);
//        secondRight.left = thirdRightLeft;
        secondRight.right = thirdRightRight;
        Problem28 p28 = new Problem28();

        boolean result = p28.isSymmetric(root);
        System.out.println(result);
    }
}
