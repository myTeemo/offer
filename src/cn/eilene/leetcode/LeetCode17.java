package cn.eilene.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description LeetCode 17. 电话号码的字母组合
 * @Author MY-HE
 * @Date 2020-05-23 09:24
 */


public class LeetCode17 {

    private String[] s = new String[]{
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return res;
        }
        findCombination(digits, 0, "");
        return res;
    }

    public void findCombination(String digits, int index, String r) {
        if (index == digits.length()) {
            res.add(r);
            return;
        }
        char c = digits.charAt(index);
        String letters = this.s[c - '2'];
        for (int i = 0; i < letters.length(); i++) {
            findCombination(digits, index + 1, r + letters.charAt(i));
        }
    }

    public static void main(String[] args) {
        LeetCode17 lc = new LeetCode17();
        String digits = new String("23");
        List<String> strings = lc.letterCombinations(digits);
        System.out.println(strings);
    }
}

