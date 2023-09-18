package com.roydon.leetcode.medium;

/**
 * IntegerBreak
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/18
 * 343. 整数拆分
 **/
public class IntegerBreak {
    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }

    public static int integerBreak(int n) {
        // 动态规划
        // 1、定义dp[]，正整数i得最大乘积为dp[i],j为拆分
        // 2、递推公式：dp[i] = max(dp[i],j*(i-j),j*dp[i-j])
        //3、初始化dp[0] = 0,dp[1] = 0,dp[2] = 1
        int[] dp = new int[n+1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j),j* dp[i - j]));
            }
        }
        return dp[n];
    }
}
