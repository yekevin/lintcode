package minumunDepthOfBinaryTree;

/**
 * @author Kevin
 * @description 二叉树的最小深度 二叉树的最小深度为根节点到最近叶子节点的距离。
 * @date 2017/3/16
 */
public class MinumunDepthOfBinaryTree {
    public static class TreeNode {

        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getMin(root);
    }

    private int getMin(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.min(getMin(root.left), getMin(root.right)) + 1;
    }
}
