package com.roydon.leetcode.easy;

/**
 * MinCostClimbingStairs
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/16
 * 746. 使用最小花费爬楼梯
 **/
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        // 动态规划
        // 1、定义dp[i]，到达i位置所需要的花费dp[i]；
        //2、递推公式：dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]
        //3、初始化dp[],dp[0] = 0,dp[1] = 0;
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        return dp[cost.length];
    }
}
