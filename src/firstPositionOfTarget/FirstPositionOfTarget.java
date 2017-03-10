package firstPositionOfTarget;

/**
 * @author Kevin
 * @description 给定一个排序的整数数组（升序）和一个要查找的整数target，用O(logn)的时间查找到target第一次出现的下标（从0开始），如果target不存在于数组中，返回-1。
 * @date 2017/3/10
 */
public class FirstPositionOfTarget {

    public int binarySearch(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                // 将目标位置也包含进去
                high = mid;
            }
        }
        if (nums[low] == target) {
            return low;
        }
        return -1;
    }
}
