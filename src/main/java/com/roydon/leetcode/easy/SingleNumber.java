package com.roydon.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * SingleNumber
 *
 * @AUTHOR: roydon
 * @DATE: 2023/10/14
 * 136. 只出现一次的数字
 **/
public class SingleNumber {
    public static void main(String[] args) {

    }

    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int left = 0;
        while (left < nums.length) {
            int count = map.get(nums[left]) == null ? 1 : 2;
            map.put(nums[left], count);
            left++;
        }
        for (Integer key : map.keySet()) {
            if (map.get(key)==1) {
                return key;
            }
        }
        return -1;

        // 2、异或
//        int ans = nums[0];
//        if (nums.length > 1) {
//            for (int i = 1; i < nums.length; i++) {
//                ans = ans ^ nums[i];
//            }
//        }
//        return ans;
    }
}
