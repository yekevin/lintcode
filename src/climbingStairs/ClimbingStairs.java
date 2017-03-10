package climbingStairs;

/**
 * @author Kevin
 * @description 假设你正在爬楼梯，需要n步你才能到达顶部。但每次你只能爬一步或者两步，你能有多少种不同的方法爬到楼顶部？
 * @date 2017/3/10
 */
public class ClimbingStairs {

    /**
     * 使用数组实现
     *
     * @param n
     * @return
     */
    public int clibingStairsWithArray(int n) {
        int[] arr = new int[n];
        if (n <= 1) {
            return 1;
        }
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }

    /**
     * 更巧妙的实现
     *
     * @param n
     * @return
     */
    public int clibingStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int last = 1, lastlast = 1;
        int now = 0;
        for (int i = 2; i <= n; i++) {
            now = last + lastlast;
            lastlast = last;
            last = now;
        }
        return now;
    }
}
