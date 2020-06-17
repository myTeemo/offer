package cn.eilene.offer;

import java.util.PriorityQueue;

/**
 * 面试题40. 最小的k个数
 */
public class Problem40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int num : arr) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (num < pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }
        int[] result = new int[pq.size()];
        int i = 0;
        for (int num : pq) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        Problem40 p40 = new Problem40();
        int[] result = p40.getLeastNumbers(arr, 2);
        System.out.println(result);
    }
}
