package mergeTwoSortedArray;

/**
 * @author Kevin
 * @description 合并排序数组
 * @date 2017/3/17
 */
public class MergeTwoSortedArray {

    public int[] mergeSortedArray(int[] A, int[] B) {
        // 合并结果
        int[] result = new int[A.length + B.length];
        // index 为result指针
        // i 为A数组指针
        // j 为B数组指针
        int index = 0, i = 0, j = 0;
        // 合并部分数组,更小size的数组将被遍历完
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                result[index++] = A[i++];
            } else {
                result[index++] = B[j++];
            }
        }

        // 将剩余的数组追加即可
        while (i < A.length) {
            result[index++] = A[i++];
        }

        while (j < B.length) {
            result[index++] = B[j++];
        }

        return result;
    }
}
