package intersectionOfTwoArrays2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Kevin
 * @description 计算两个数组的交 每个元素出现次数得和在数组里一样
 * @date 2017/3/14
 */
public class IntersectionOfTwoArrays {

    /**
     * hashMap实现
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // map保存key出现的次数
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0, size = nums1.length; i < size; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }

        List<Integer> results = new ArrayList<Integer>();

        for (int i = 0, size = nums2.length; i < size; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                results.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int result[] = new int[results.size()];
        for (int i = 0; i < results.size(); ++i)
            result[i] = results.get(i);

        return result;
    }
}
