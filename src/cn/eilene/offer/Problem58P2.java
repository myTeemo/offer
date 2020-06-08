package cn.eilene.offer;

/**
 * @Description 面试题58 - II. 左旋转字符串
 * @Author MY-HE
 * @Date 2020-06-08 12:09
 */
public class Problem58P2 {
    public String reverseLeftWords(String s, int n) {
        String left = s.substring(0, n);
        String right = s.substring(n);
        StringBuffer sb = new StringBuffer();
        sb.append(right);
        sb.append(left);
        return sb.toString();
    }

    public static void main(String[] args) {
        Problem58P2 p58 = new Problem58P2();
        String res = p58.reverseLeftWords("lrloseumgh", 6);
        System.out.println("res = " + res);
    }
}
