package moveZeroes;

/**
 * @author Kevin
 * @description 给一个数组 nums 写一个函数将 0 移动到数组的最后面，非零元素保持原数组的顺序
 * @date 2017/3/17
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int left = 0, right = 0, temp = 0, size = nums.length;
        // 指针到最后一个元素后跳出循环
        while (right < size) {
            // 元素为0的话left则指向该元素
            // 元素不为0则可以与left元素交换
            if (nums[right] != 0) {
                // 左右指针指向不同的元素则交换位置
                if (left != right) {
                    temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                }
                left++;
            }
            // 指针向后移动一位
            right++;
        }
    }
}
