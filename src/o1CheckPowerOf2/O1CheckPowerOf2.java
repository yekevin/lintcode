package o1CheckPowerOf2;

/**
 * @author Kevin
 * @description 用 O(1) 时间检测整数 n 是否是 2 的幂次。
 * @date 2017/3/17
 */
public class O1CheckPowerOf2 {

    // n = 4
    // 二进制n    100
    // 二进制n-1  011
    public boolean checkPowerOf2(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
