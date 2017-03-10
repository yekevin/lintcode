package binaryTreePaths;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin
 * @description 给一棵二叉树，找出从根节点到叶子节点的所有路径。
 * @date 2017/3/10
 */
public class BinaryTreePaths {

    public static class TreeNode {

        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        String path = String.valueOf(root.val);
        helper(root, path, result);
        return result;
    }

    private void helper(TreeNode root, String path, List<String> result) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }
        if (root.left != null) {
            path = path + "->" + String.valueOf(root.left.val);
            helper(root.left, path + "->" + String.valueOf(root.left.val), result);
        }
        if (root.right != null) {
            helper(root.right, path + "->" + String.valueOf(root.right.val), result);
        }
    }
}
