package intersectionOfTwoArrays;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Kevin
 * @description 两个数组的交集
 * @date 2017/3/14
 */
public class IntersectionOfTwoArrays {

    /**
     * hashset方式
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersectionWithHash(int[] nums1, int[] nums2) {
        // Write your code here
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0, size = nums1.length; i < size; i++) {
            hash.add(nums1[i]);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for (int i = 0, size = nums2.length; i < size; i++) {
            if (hash.contains(nums2[i])) {
                resultSet.add(nums2[i]);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;
        for (Integer num : resultSet) {
            result[index++] = num;
        }
        return result;
    }

    /**
     * sort & merge方式
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersectionWithSortMerge(int[] nums1, int[] nums2) {
        // 将数组排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // 两数组的位置指针
        int i = 0, j = 0;
        int index = 0;
        // 装载临时结果
        int[] temp = new int[nums1.length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // 比较前一个位置是否是相同的数
                if (index == 0 || temp[index - 1] != nums1[i]) {
                    temp[index++] = nums1[1];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[index];
        for (int k = 0; k < index; k++) {
            result[k] = temp[k];
        }
        return result;
    }

    /**
     * 二叉搜索树方式
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersectionOfBinaryTree(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return null;
        }

        HashSet<Integer> resultSet = new HashSet<>();
        Arrays.sort(nums1);
        for (int i = 0, size = nums2.length; i < nums2.length; i++) {
            if (resultSet.contains(nums2[i])) {
                continue;
            }
            if (binarySearch(nums1, nums2[i])) {
                resultSet.add(nums2[i]);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;
        for (Integer num : resultSet) {
            result[index++] = num;
        }
        return result;
    }

    private boolean binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (nums[start] == target) {
            return true;
        }
        if (nums[end] == target) {
            return true;
        }
        return false;
    }
}
