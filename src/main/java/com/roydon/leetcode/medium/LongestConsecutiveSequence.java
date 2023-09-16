package com.roydon.leetcode.medium;

import java.util.*;

/**
 * LongestConsecutiveSequence
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/15
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * <a href="https://leetcode.cn/problems/longest-consecutive-sequence">...</a>
 **/
public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}));
    }

    public static int longestConsecutive(int[] nums) {
        // 数组放入set集合，需要遍历每一个数，找出当前最小数可组成的最长序列
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int num : nums) {
//            hashSet.add(num);
//        }
//        int longest = 0;
//        for (Integer num : hashSet) {
//            if (!hashSet.contains(num - 1)) {
//                int curNum = num;
//                int curLen = 1;
//                while (hashSet.contains(curNum + 1)) {
//                    curLen++;
//                    curNum++;
//                }
//                longest = Math.max(longest, curLen);
//            }
//        }
//        return longest;
        // 2、暴力枚举
        if (nums.length < 1) return 0;
        if (nums.length == 1) return 1;
        Arrays.sort(nums);
        int longest = 1, curLen = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                curLen++;
            } else if (nums[i + 1] == nums[i]) {
                continue;
            } else {
                curLen = 1;
            }
            longest = Math.max(longest, curLen);
        }
        return longest;
    }
}
