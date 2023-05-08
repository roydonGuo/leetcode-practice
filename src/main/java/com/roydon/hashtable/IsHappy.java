package com.roydon.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * @USER: roydon
 * @DATE: 2023/5/8 16:11
 * @Description https://leetcode.cn/problems/happy-number/
 * 若sum重复出现且不为1则代表此数不是快乐数
 **/
public class IsHappy {
    public static void main(String[] args) {
        boolean solution = solution(19);
        System.out.println("solution = " + solution);
    }

    public static boolean solution(int n) {
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
