package minimumSubarray;

/**
 * @author Kevin
 * @description 最小子数组 : 给定一个整数数组，找到一个具有最小和的子数组。返回其最小和。
 * @date 2017/3/17
 */
public class MinimumSubarray {

    public int minSubarray(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(sum, min);
            sum = Math.min(sum, 0);
        }
        return min;
    }
}
