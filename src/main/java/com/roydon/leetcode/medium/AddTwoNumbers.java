package com.roydon.leetcode.medium;

import com.roydon.domain.ListNode;

/**
 * AddTwoNumbers
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/2
 * 两链表遍历，从头节点开始相加，注意进位
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例 1：
 * <p>
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 *
 * <a href="https://leetcode.cn/problems/add-two-numbers">...</a>
 **/
public class AddTwoNumbers {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 定义新链表接收数据
        ListNode head = null;
        ListNode newNode = null;

        int jinwei = 0;
        // 遍历两链表
        while (l1 != null || l2 != null) {
            // 链表值相加,大于10则进一
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;
            int value = l1Val + l2Val + jinwei;

            if (value >= 10) {
                jinwei = 1;
                value = value % 10;
            } else {
                jinwei = 0;
            }
            if (head == null) {
                head = new ListNode(value);
                newNode = head;
            } else {
                newNode.next = new ListNode(value);
                newNode = newNode.next;
            }

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        // 链表遍历完后，可能还有进位，所以判断jinwei的值
        if (jinwei != 0) {
            newNode.next = new ListNode(jinwei);
        }
        return head;

    }
}
