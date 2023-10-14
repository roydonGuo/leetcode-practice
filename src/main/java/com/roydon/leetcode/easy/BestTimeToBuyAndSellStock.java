package com.roydon.leetcode.easy;

import java.util.ArrayDeque;

/**
 * BestTimeToBuyAndSellStock
 *
 * @AUTHOR: roydon
 * @DATE: 2023/10/1
 * 121. 买卖股票的最佳时机
 **/
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        int length = prices.length;
        int min = prices[0], max = 0;
        for (int i = 0; i < length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > max) {
                max = prices[i];
            }
        }
        return max;
    }
}
