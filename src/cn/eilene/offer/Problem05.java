package cn.eilene.offer;

/**
 * @Description 剑指Offer 面试题05. 替换空格
 * @Author MY-HE
 * @Date 2020-05-18 10:22
 */
public class Problem05 {

    public static void main(String[] args) {
        Problem05 rs = new Problem05();
        String s = " 0 ";
        System.out.println(rs.replaceSpace(s));
    }

    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (char c : chars) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
