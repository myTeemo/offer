package cn.eilene.offer;

import java.util.HashMap;

public class Problem50 {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> dict = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (dict.containsKey(ch)) {
                dict.put(ch, false);
            } else {
                dict.put(ch, true);
            }
        }
        for (char ch : chars) {
            if (dict.get(ch)) {
                return ch;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        Problem50 p50 = new Problem50();
        String s = "abaccdeff";
        System.out.println(p50.firstUniqChar(s));
    }
}
