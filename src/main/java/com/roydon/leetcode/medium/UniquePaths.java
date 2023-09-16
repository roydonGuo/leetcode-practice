package com.roydon.leetcode.medium;

/**
 * UniquePaths
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/16
 * 62.不同路径
 **/
public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));

    }

    public static int uniquePaths(int m, int n) {
        // 动态规划
        // 机器人在某个格子到达终点前，要么往下走，要么往右侧走，
        // 1、定义dp[i][j]，到达i,j位置有dp[i][j]条路径；
        //2、递推公式：dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        //3、初始化第一行为1，第二行为1；
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
