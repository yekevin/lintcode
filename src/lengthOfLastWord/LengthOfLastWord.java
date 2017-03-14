package lengthOfLastWord;

/**
 * @author Kevin
 * @description 给定一个字符串， 包含大小写字母、空格' '，请返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * @date 2017/3/14
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int length = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (length == 0) {
                if (chars[i] == ' ') {
                    continue;
                } else {
                    length++;
                }
            } else {
                if (chars[i] == ' ') {
                    break;
                } else {
                    length++;
                }
            }
        }
        return length;
    }
}
