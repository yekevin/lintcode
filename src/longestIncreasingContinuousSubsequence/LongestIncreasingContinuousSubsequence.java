package longestIncreasingContinuousSubsequence;

/**
 * @author Kevin
 * @description 最长上升连续子序列
 * 给定一个整数数组（下标从 0 到 n-1， n 表示整个数组的规模），请找出该数组中的最长上升连续子序列。（最长上升连续子序列可以定义为从右到左或从左到右的序列。）
 * @date 2017/3/14
 */
public class LongestIncreasingContinuousSubsequence {

    public int longestIncreasingContinuousSubsequence(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int n = A.length;
        int result = 1;
        // left->right
        int length = 1;
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                length++;
            } else {
                length = 1;
            }
            result = Math.max(length, result);
        }

        // right->left
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] > A[i + 1]) {
                length++;
            } else {
                length = 1;
            }
            result = Math.max(length, result);
        }

        return result;
    }
}
