package binaryTreePreOrderTraversal;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Kevin
 * @description 二叉树前序遍历 root -> left -> right
 * @date 2017/3/8
 */
public class BinaryTreePreOrderTraversal {

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
    public ArrayList<Integer> binaryTreePreOrderWithLoop(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }

    /**
     * 递归方式
     *
     * @param root
     * @return
     */
    public ArrayList<Integer> binaryTreePreOrderWithRecursion(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorderRecursion(root, result);
        return result;
    }

    private void preorderRecursion(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preorderRecursion(root.left, result);
        preorderRecursion(root.right, result);
    }
}
