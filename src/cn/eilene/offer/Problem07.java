package cn.eilene.offer;

/**
 * @Description 剑指Offer 面试题07. 重建二叉树
 * @Author MY-HE
 * @Date 2020-05-18 15:01
 */
public class Problem07 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        int[] preorder = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
        Problem07 rbt = new Problem07();
        TreeNode td = rbt.buildTree(preorder, inorder);
        System.out.println(td);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        return construct(preorder, inorder, 0, 0, inorder.length - 1);
    }
    public TreeNode construct(int[] preorder, int[] inorder, int preIndex, int inStart, int inEnd) {
        if (inEnd < inStart) {
            return null;

        }

        int rootValue = preorder[preIndex];
        TreeNode root = new TreeNode(rootValue);
        root.left = null;
        root.right = null;
        int middle = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootValue) {
                middle = i;
                break;
            }
        }
        root.left = construct(preorder, inorder, preIndex + 1, inStart, middle - 1);
        root.right = construct(preorder, inorder, preIndex + middle - inStart + 1, middle + 1, inEnd);
        return root;
    }
}
