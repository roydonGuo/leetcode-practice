package com.roydon.leetcode.medium;

import java.util.*;

/**
 * LongestSubstringWithoutRepeatingCharacters
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/4
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * <a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/">...</a>
 * <p>
 * # 滑动窗口
 **/
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println("lengthOfLongestSubstring = " + lengthOfLongestSubstring("asjrgapa"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;

    }

//    public static int lengthOfLongestSubstring(String s) {
//        if (s.length() == 0) return 0;
//        Set<Integer> num = new HashSet<>();
//        List<Character> sbs = new ArrayList<>();
//        int maxLength = 1;
//        num.add(maxLength);
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i; j < s.length(); j++) {
//                char charStr = s.charAt(j);
//                if (!sbs.contains(charStr)) {
//                    // 集合中不包含此字符，就添加到集合中
//                    sbs.add(charStr);
//                    if (sbs.size() > maxLength) {
//                        maxLength = sbs.size();
//                        num.add(maxLength);
//                    }
//                } else {
//                    // 集合包含此元素,移除所有元素并记录当前长度
//                    maxLength = sbs.size();
//                    num.add(maxLength);
//                    sbs.clear();
//                    sbs.add(charStr);
//                }
//
//            }
//            sbs.clear();
//        }
//        return num.stream().reduce((x, y) -> x > y ? x : y).get();
//    }

}
