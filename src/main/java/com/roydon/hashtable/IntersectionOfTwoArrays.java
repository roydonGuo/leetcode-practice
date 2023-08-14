package com.roydon.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * @USER: roydon
 * @DATE: 2023/5/8 15:54
 * @Description 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 * <p>
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 * 解释：[4,9] 也是可通过的
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/intersection-of-two-arrays">...</a>
 **/
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] intersection = intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        for (int i : intersection) {
            System.out.println(i);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }
        return set2.stream().mapToInt(i -> i).toArray();
    }
}
