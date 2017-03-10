package cloneBinaryTree;

/**
 * @author Kevin
 * @description 克隆二叉树
 * @date 2017/3/10
 */
public class CloneBinaryTree {

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
     * @param root
     * @return
     */
    public TreeNode cloneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode cloneNode = new TreeNode(root.val);
        cloneNode.left = cloneTree(root.left);
        cloneNode.right = cloneTree(root.right);
        return cloneNode;
    }
}
