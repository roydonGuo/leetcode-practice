package com.roydon.hashtable;

/**
 * @USER: roydon
 * @DATE: 2023/5/8 15:23
 * @Description https://leetcode.cn/problems/valid-anagram/
 **/
public class IsAnagram {
    public static void main(String[] args) {
        boolean solution = solution("eae", "aee");
        System.out.println("solution = " + solution);
    }

    public static boolean solution(String s, String t) {
        int[] record = new int[26];//26字母的哈希表，记录字符出现的次数
        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a']--;
        }
        for (int i : record) {
            if (i != 0) return false;
        }
        return true;
    }
}
