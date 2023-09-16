package com.roydon.leetcode.medium;

/**
 * UniquePaths2
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/16
 * 63.不同路径2
 **/
public class UniquePaths2 {
    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}}));

    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // 动态规划
        // 机器人在某个格子到达终点前，要么往下走，要么往右侧走，
        // 1、定义dp[i][j]，到达i,j位置有dp[i][j]条路径；
        //2、递推公式：dp[i][j] = dp[i - 1][j] + dp[i][j - 1]，需要判断当前是否有障碍，若有障碍则跳过计算if (obstacleGrid[i][j] != 1)
        //3、初始化第一行为1，第二行为1；有障碍的右侧或者下侧初始化为0；
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m && obstacleGrid[i][0] != 1; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n && obstacleGrid[0][j] != 1; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] != 1) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
