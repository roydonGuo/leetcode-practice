package com.roydon.easy;

/**
 * @author roydon
 * @date 2023-08-07 11:20【星期一】
 * @description com.roydon.easy
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须[原地修改]输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = ["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"] </p>
 **/
public class ReverseString {

    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        for (char c : chars) {
            System.out.println(c);
        }
    }

    public static void reverseString(char[] s) {
        // 1.正常for循环造成时间复杂度高
        // 2.双指针，交换头尾指针对应位置元素
//        for (int left = 0, right = s.length - 1; left < right; ++left, --right) {
//            char tmp = s[left];
//            s[left] = s[right];
//            s[right] = tmp;
//        }
        int left = 0, right = s.length - 1;
        while (left < right) {
            revPos(s, left, right);
            left++;
            right--;
        }
    }

    private static void revPos(char[] t, int left, int right) {
        char tem = t[left];
        t[left] = t[right];
        t[right] = tem;
    }

}
