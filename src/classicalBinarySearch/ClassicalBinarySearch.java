package classicalBinarySearch;

/**
 * @author Kevin
 * @description 二分查找:在一个排序数组中找一个数，返回该数出现的任意位置，如果不存在，返回-1
 * @date 2017/3/7
 */
public class ClassicalBinarySearch {

    public int classicalBinarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
