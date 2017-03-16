package maximumSubarray;

/**
 * @author Kevin
 * @description 最大子数组 : 给定一个整数数组，找到一个具有最大和的子数组，返回其最大和。
 * @date 2017/3/16
 */
public class MaxumumSubarray {

    public int maxSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }
        return max;
    }
}
