package com.roydon.leetcode.easy;

import java.util.Stack;

/**
 * ValidParentheses
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/11
 * 有效的括号：给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <a href="https://leetcode.cn/problems/valid-parentheses">...</a>
 **/
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println("isValid = " + isValid("()[]{}"));

    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        // 满足左括号进栈，右括号出现就出栈，最后判断栈是否为空
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.empty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.empty();
    }
}
