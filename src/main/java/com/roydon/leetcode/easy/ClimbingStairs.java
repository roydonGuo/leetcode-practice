package com.roydon.leetcode.easy;

/**
 * ClimbingStairs
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/16
 **/
public class ClimbingStairs {
    public static void main(String[] args) {

        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        // 动态规划
        // dp[i]表示第i阶有dp[i]种方法，dp[i] = dp[i-1]+dp[i-2];,dp[0] = ?,dp[1] = 1,dp[2] = 2;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        int sum = 1;
        for (int i = 3; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
            sum = dp[1] + dp[2];
            dp[1] = dp[2];
            dp[2] = sum;
        }
        return sum;
    }
}
