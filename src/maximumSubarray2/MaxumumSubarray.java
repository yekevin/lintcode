package maximumSubarray2;

/**
 * @author Kevin
 * @description 给定一个整数数组，找出两个不重叠子数组使得它们的和最大。
 * 每个子数组的数字在数组中的位置应该是连续的。
 * 因为 两个subarray 一定不重叠所以必定存在一条分割线
 * @date 2017/3/16
 */
public class MaxumumSubarray {

    public int maxTwoSubarray(int[] nums) {
        int sum = 0;
        int minSum = 0;
        int max = Integer.MIN_VALUE;
        int size = nums.length;
        int[] left = new int[size];
        int[] right = new int[size];

        // 左边数组中的最大和数组
        for (int i = 0; i < size; i++) {
            sum += nums[i];
            max = Math.max(max, sum - minSum);
            minSum = Math.min(sum, minSum);
            left[i] = max;
        }

        sum = 0;
        minSum = 0;
        max = Integer.MIN_VALUE;
        // 右边数组中的最大和
        for (int i = size - 1; i >= 0; i--) {
            sum += nums[i];
            max = Math.max(max, sum - minSum);
            minSum = Math.min(sum, minSum);
            right[i] = max;
        }

        max = Integer.MIN_VALUE;
        // 合并后的最大和
        for (int i = 0; i < size - 1; i++) {
            max = Math.max(max, left[i] + right[i + 1]);
        }
        return max;
    }
}
