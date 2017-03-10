package binaryTreePathSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Kevin
 * @description 二叉树的路径和
 * 给定一个二叉树，找出所有路径中各节点相加总和等于给定 目标值 的路径。
 * 一个有效的路径，指的是从根节点到叶节点的路径。
 * @date 2017/3/9
 */
public class BinaryTreePathSum {
    public static class TreeNode {

        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        if (root == null) {
            return result;
        }
        Stack<Integer> stack = new Stack<Integer>();
        findPath(root, target, stack);
        return result;
    }

    public void findPath(TreeNode root, int k, Stack<Integer> path) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (root.val == k) {
                List<Integer> pathList = new ArrayList<>();
                for (int p : path) {
                    pathList.add(p);
                }
                pathList.add(root.val);
                result.add(pathList);
            }
        } else {
            path.push(root.val);
            findPath(root.left, k - root.val, path);
            findPath(root.right, k - root.val, path);
            path.pop();
        }
    }
}
