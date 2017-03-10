package compareStrings;

/**
 * @author Kevin
 * @description 比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写字母
 * 给出 A = "ABCD" B = "ACD"，返回 true
 * 给出 A = "ABCD" B = "AABC"， 返回 false
 * @date 2017/3/10
 */
public class CompareStrings {

    public boolean compareStrings(String A, String B) {
        int[] count = new int[26];
        // init
        for (int i = 0, length = count.length; i < length; i++) {
            count[i] = 0;
        }

        for (int i = 0, length = A.length(); i < length; i++) {
            count[A.charAt(i) - 'A']++;
        }

        for (int i = 0, length = B.length(); i < length; i++) {
            count[B.charAt(i) - 'A']--;
            if (count[B.charAt(i) - 'A'] < 0) {
                return false;
            }
        }
        return true;
    }
}
