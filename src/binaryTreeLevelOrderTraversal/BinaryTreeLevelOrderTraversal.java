package binaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Kevin
 * @description 给出一棵二叉树，返回其节点值的层次遍历（逐层从左往右访问）
 * @date 2017/3/9
 */
public class BinaryTreeLevelOrderTraversal {
    public static class TreeNode {

        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    /**
     * 广度优先方式
     *
     * @param root
     * @return
     */
    public ArrayList<ArrayList<Integer>> levelOrderBfs(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if (root == null) {
            return result;
        }

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int i = 0, size = queue.size(); i < size; i++) {
                // 取第一个元素
                TreeNode node = queue.pop();
                temp.add(node.val);
                // 放置队列最后
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(temp);
        }
        return result;
    }

    /**
     * 深度优先方式
     *
     * @param root
     * @return
     */
    public ArrayList<ArrayList<Integer>> levelOrderDfs(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        // TODO
        return result;
    }

}
