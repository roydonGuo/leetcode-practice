package com.roydon.leetcode.easy;

/**
 * FeiBoNaQiShuLieLcof
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/16
 **/
public class FeiBoNaQiShuLieLcof {
    public static void main(String[] args) {
        System.out.println(fib(48));
    }

    public static int fib(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // 动态规划
        int[] dp = new int[n];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] % 1000000007 + dp[i - 2] % 1000000007;
        }
        return dp[n - 1] % 1000000007;
    }
}
