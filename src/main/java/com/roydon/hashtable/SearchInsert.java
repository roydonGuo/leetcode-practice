package com.roydon.hashtable;

/**
 * @USER: roydon
 * @DATE: 2023/5/8 15:30
 * @Description https://leetcode.cn/problems/search-insert-position/
 **/
public class SearchInsert {
    public static void main(String[] args) {
        int solution = solution(new int[]{1, 2, 3, 4, 5, 6}, 5);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2; // 避免溢出：left+(right-left)/2
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return right + 1;
    }
}
