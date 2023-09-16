package com.roydon.leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * MedianOfTwoSortedArrays
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/5
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * 示例 2：
 * <p>
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 * <p>
 * <a href="https://leetcode.cn/problems/median-of-two-sorted-arrays/">...</a>
 **/
public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{2, 3};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println("medianSortedArrays = " + medianSortedArrays);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sortedArrays = mergeSortedArrays(nums1, nums2);
        // 求中位数
        int length = sortedArrays.length;
        if (length % 2 == 1) {
            // 奇数
            return sortedArrays[length / 2];
        }
        int index = length / 2;
        return (double) (sortedArrays[index - 1] + sortedArrays[index]) / 2;
    }

    // 合并数组
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

}
