package com.roydon.leetcode.easy;

/**
 * MoveZeroes
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/15
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 示例 1:
 * <p>
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <a href="https://leetcode.cn/problems/move-zeroes">...</a>
 **/
public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1});

    }

    public static void moveZeroes(int[] nums) {
        // 要求只在当前数组操作：思路：双指针
//        int length = nums.length;
//        int left, right = length - 1;
//        for (left = 0; left < length; left++) {
//            if (nums[left] == 0 && left < right) {
//                // 开始移动数组
//                int curIndex = left;
//                for (int i = curIndex + 1; i < length; i++) {
//                    nums[curIndex++] = nums[i];
//                }
//                nums[right--] = 0;
//            } else if (left >= right) {
//                break;
//            }
//            // 解决连续两个0
//            if (nums[left] == 0) {
//                left--;
//            }
//        }
        int l = 0, r = 0;
        while (r < nums.length) {
            if (nums[r] != 0) {
                int t = nums[r];
                nums[r] = nums[l];
                nums[l++] = t;
            }
            ++r;
        }

    }
}
