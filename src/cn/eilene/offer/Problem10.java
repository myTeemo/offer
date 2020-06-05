package cn.eilene.offer;

import java.util.Scanner;

/**
 * @Description 剑指Offer 面试题10- I. 斐波那契数列
 * @Author MY-HE
 * @Date 2020-05-15 10:18
 */
public class Problem10 {

    public static void main(String[] args) {
        System.out.println(fib(95));
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int s1 = 0;
        int s2 = 1;
        n -= 2;
        int sum = 0;
        while (n >= 0) {
            sum = (s1 % 1000000007 + s2 % 1000000007) % 1000000007;
            s1 = s2 % 1000000007;
            s2 = sum;
            n--;
        }
        return sum;
    }
}
