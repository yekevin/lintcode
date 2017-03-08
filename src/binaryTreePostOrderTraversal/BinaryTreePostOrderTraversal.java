package binaryTreePostOrderTraversal;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Kevin
 * @description 二叉树后序遍历 left -> right -> root
 * @date 2017/3/8
 */
public class BinaryTreePostOrderTraversal {

    public static class TreeNode {

        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    /**
     * 遍历方式
     *
     * @param root
     * @return
     */
    public ArrayList<Integer> binaryTreePostOrderWithLoop(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode prev = null; // previously traversed node
        TreeNode curr = root;

        if (root == null) {
            return result;
        }

        stack.push(root);
        while (!stack.empty()) {
            curr = stack.peek();
            if (prev == null || prev.left == curr || prev.right == curr) { // traverse down the tree
                if (curr.left != null) {
                    stack.push(curr.left);
                } else if (curr.right != null) {
                    stack.push(curr.right);
                }
            } else if (curr.left == prev) { // traverse up the tree from the left
                if (curr.right != null) {
                    stack.push(curr.right);
                }
            } else { // traverse up the tree from the right
                result.add(curr.val);
                stack.pop();
            }
            prev = curr;
        }

        return result;
    }

    /**
     * 递归方式
     *
     * @param root
     * @return
     */
    public ArrayList<Integer> binaryTreePostOrderWithRecursion(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        postorderRecursion(root, result);
        return result;
    }

    private void postorderRecursion(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        postorderRecursion(root.left, result);
        postorderRecursion(root.right, result);
        result.add(root.val);
    }
}
