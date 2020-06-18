package cn.eilene.offer;

import javafx.util.Pair;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Description 面试题13. 机器人的运动范围
 * @Author MY-HE
 * @Date 2020-06-17 17:30
 */
public class Problem13 {
    private boolean[][] visit;

    public class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public Deque<Position> queue = new LinkedList<>();

    public int movingCount(int m, int n, int k) {
        visit = new boolean[m][n];
        Position p = new Position(0, 0);
        queue.addLast(p);
    }

    public void dfs(int i, int j, int k) {
        char[] ci = String.valueOf(i).toCharArray();
        char[] cj = String.valueOf(j).toCharArray();
        int sum = 0;
        for (char c : ci) {
            sum += c - '0';
        }
        for (char c : cj) {
            sum += c - '0';
        }


    }

}
