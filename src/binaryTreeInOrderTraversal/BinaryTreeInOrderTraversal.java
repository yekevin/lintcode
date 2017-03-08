package binaryTreeInOrderTraversal;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Kevin
 * @description 二叉树中序遍历 left -> root -> right
 * @date 2017/3/8
 */
public class BinaryTreeInOrderTraversal {

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
    public ArrayList<Integer> inOrderTraversalWithLoop(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        TreeNode curt = root;
        while (curt != null || !stack.empty()) {
            while (curt != null) {
                stack.add(curt);
                curt = curt.left;
            }
            curt = stack.pop();
            result.add(curt.val);
            curt = curt.right;
        }
        return result;
    }


    /**
     * 递归方式
     *
     * @param root
     * @return
     */


    public ArrayList<Integer> inOrderTraversalWithRecursion(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        inorderRecursion(root, result);
        return result;
    }

    private void inorderRecursion(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        inorderRecursion(root.left, result);
        result.add(root.val);
        inorderRecursion(root.right, result);
    }
}