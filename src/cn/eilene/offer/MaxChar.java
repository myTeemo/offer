package cn.eilene.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Description TODO
 * @Author MY-HE
 * @Date 2020-05-15 10:28
 */
public class MaxChar {
    public static void main(String[] args) {
        String input = "wwwaaacccdddee";
        new MaxChar().doString(input);
    }

    private void doString(String input) {
        char[] chars = input.toCharArray();
        ArrayList lists = new ArrayList<>();
        TreeSet set = new TreeSet<>();
        for (int i = 0; i < chars.length; i++) {
            lists.add(String.valueOf(chars[i]));
            set.add(String.valueOf(chars[i]));
        }
        System.out.println(set);
        Collections.sort(lists);
        System.out.println(lists);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < lists.size(); i++) {
            sb.append(lists.get(i));
        }

        input = sb.toString();
        String maxString = "";
        ArrayList maxList = new ArrayList();
        int maxLength = 0;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            int begin = input.indexOf(s);
            int end = input.lastIndexOf(s);
            int value = end - begin + 1;
            if (value > maxLength) {
                maxLength = value;
                maxString = s;
                maxList.clear();
                maxList.add(s);

            } else if (value == maxLength) {
                maxList.add(s);
            }
        }
        for (int i = 0; i < maxList.size(); i++) {
            System.out.println(maxList.get(i) + " " + maxLength);
        }
    }
}
