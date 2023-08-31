package com.roydon.java.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * @USER: roydon
 * @DATE: 2023/5/8 16:11
 * @Description 若sum重复出现且不为1则代表此数不是快乐数
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * <p>
 * 「快乐数」定义为：
 * <p>
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为 1，那么这个数就是快乐数。
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 19
 * 输出：true
 * 解释：
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * <p>
 * 示例 2：
 * <p>
 * 输入：n = 2
 * 输出：false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/happy-number/">...</a>
 **/
public class HappyNumber {
    public static void main(String[] args) {
        boolean isHappy = isHappy(19);
        System.out.println("isHappy = " + isHappy);
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            int sum = getSum(n);
            if (sum == 1) return true;
            if (set.contains(sum)) return false;
            else set.add(sum);
            n = sum;
        }
    }

    public static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
