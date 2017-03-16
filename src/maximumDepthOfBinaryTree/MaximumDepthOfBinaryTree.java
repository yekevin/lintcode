package maximumDepthOfBinaryTree;

/**
 * @author Kevin
 * @description 二叉树的最大深度
 * @date 2017/3/16
 */
public class MaximumDepthOfBinaryTree {

    public static class TreeNode {

        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    /**
     * 递归方式
     *
     * @param root
     * @return
     */
    public int maxDepthWithRecursion(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepthWithRecursion(root.left);
        int right = maxDepthWithRecursion(root.right);
        return Math.max(left, right) + 1;
    }
}
