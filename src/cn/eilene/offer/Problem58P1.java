package cn.eilene.offer;

/**
 * @Description 面试题58 - I. 翻转单词顺序
 * @Author MY-HE
 * @Date 2020-06-08 11:48
 */
public class Problem58P1 {

    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (strings[i].equals("")) {
                continue;
            }
            if (i != strings.length - 1) {
                sb.append(" ");
            }
            sb.append(strings[i]);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Problem58P1 p58 = new Problem58P1();
        String result = p58.reverseWords("a good   example");
        System.out.println("result = " + result);
    }
}
