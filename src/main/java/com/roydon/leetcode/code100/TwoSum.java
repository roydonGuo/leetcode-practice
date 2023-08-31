package com.roydon.leetcode.code100;

import java.util.*;

/**
 * @author roydon
 * @date 2023-08-14 13:40【星期一】
 * @description <a href="https://zhuanlan.zhihu.com/p/397575978">...</a>
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 示例：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 *
 * <a href="https://leetcode.cn/problems/two-sum/">...</a>
 **/
public class TwoSum {
    public static void main(String[] args) {
        int[] twoSum = twoSum(new int[]{3, 1, 5, 2, 4}, 6);
        for (int i : twoSum) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 1) {
            return null;
        }
        int left = 0;
        List<Integer> set = new ArrayList<>();
        while (left < nums.length) {
            if (set.contains(target - nums[left])) {
                return new int[]{set.indexOf(target - nums[left]), left};
            }
            set.add(nums[left]);
            left++;
        }
        return null;
    }
}
