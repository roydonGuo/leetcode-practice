package com.roydon.leetcode.code100;

import java.util.ArrayList;
import java.util.List;

/**
 * TwoSumDemo2
 *
 * @AUTHOR: roydon
 * @DATE: 2023/10/9
 **/
public class TwoSumDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("twoSum(list,5,6) = " + twoSum(list, 5, 6));
    }

    public static int twoSum(ArrayList<Integer> nums, int n, int target) {
        int left = 0;
        int count = 0;
        List<Integer> set = new ArrayList<>();
        while (left < n) {
            if (set.contains(target - nums.get(left))) {
                count++;
            }
            set.add(nums.get(left));
            left++;
        }
        return count;
    }
}
