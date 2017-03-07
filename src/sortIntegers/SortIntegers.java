package sortIntegers;

/**
 * @author Kevin
 * @description 给一组整数，按照升序排序，使用选择排序，冒泡排序，插入排序或者任何 O(n2) 的排序算法。
 * @date 2017/3/7
 */
public class SortIntegers {

    /**
     * 冒泡排序
     * 1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。
     * 3.针对所有的元素重复以上的步骤，除了最后一个。
     * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     */
    public void bubbleSort(int[] A) {
        boolean swaped = true;
        for (int i = 1, size = A.length; i < size && swaped; i++) {
            swaped = false;
            for (int j = 0; j < size - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    swaped = true;
                }
            }
        }
    }

    /**
     * 插入排序
     * 1.从第一个元素开始，该元素可以认为已经被排序
     * 2.取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 3.如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 5.将新元素插入到该位置中
     * 6.重复步骤2
     */
    public void insertSort(int[] A) {
        int temp, j;
        for (int i = 1, size = A.length; i < size; i++) {
            temp = A[i];
            for (j = i; j > 0 && temp < A[j - 1]; j--) {
                A[j] = A[j - 1];
            }
            A[j] = temp;
        }
    }

    /**
     * 选择排序
     * 1.在未排序序列中找到最小元素，存放到排序序列的起始位置。
     * 2.再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。
     * 3.以此类推，直到所有元素均排序完毕。
     */
    public void selectSort(int[] A) {
        int temp;
        for (int i = 0, size = A.length; i < size; i++) {
            int k = i;
            for (int j = size - 1; j > i; j--) {
                if (A[j] < A[k]) {
                    k = j;
                }
            }
            temp = A[i];
            A[i] = A[k];
            A[k] = temp;
        }
    }

}
