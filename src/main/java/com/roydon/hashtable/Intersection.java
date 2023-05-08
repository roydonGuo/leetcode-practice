package com.roydon.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * @USER: roydon
 * @DATE: 2023/5/8 15:54
 * @Description https://leetcode.cn/problems/intersection-of-two-arrays/
 **/
public class Intersection {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        for (int i : solution) {
            System.out.println(i);
        }
        System.out.println("solution = " + solution);
    }

    public static int[] solution(int[] nums1, int[] nums2) {
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
        return set2.stream().mapToInt(i->i).toArray();
    }
}
