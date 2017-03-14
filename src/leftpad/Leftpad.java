package leftpad;

import java.util.Arrays;

/**
 * @author Kevin
 * @description 左填充
 * @date 2017/3/14
 */
public class Leftpad {

    public String leftPad(String str, int length, char ch) {
        // 填充长度大于字符串长度
        if (str.length() > length) {
            return str;
        }
        char[] chs = new char[length];
        Arrays.fill(chs, ch);
        char[] src = str.toCharArray();
        System.arraycopy(src, 0, chs, length - src.length, src.length);
        return new String(chs);
    }
}
