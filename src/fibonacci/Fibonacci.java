package fibonacci;

/**
 * @author Kevin
 * @description 查找斐波纳契数列中第 N 个数。
 * 所谓的斐波纳契数列是指：
 * 前2个数是 0 和 1 ,第 i 个数是第 i-1 个数和第i-2 个数的和。
 * 斐波纳契数列的前10个数字是：0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 * @date 2017/3/7
 */
public class Fibonacci {

    public int fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n - 1; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
