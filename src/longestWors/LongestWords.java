package longestWors;

import java.util.ArrayList;

/**
 * @author Kevin
 * @description 最长单词
 * @date 2017/3/14
 */
public class LongestWords {

    public ArrayList<String> longestWords(String[] dictionary) {
        int maxLen = 0;
        for (int i = 0, size = dictionary.length; i < size; i++) {
            if (dictionary[i].length() > maxLen) {
                maxLen = dictionary[i].length();
            }
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0, size = dictionary.length; i < size; i++) {
            if (dictionary[i].length() == maxLen) {
                result.add(dictionary[i]);
            }
        }
        return result;
    }
}
