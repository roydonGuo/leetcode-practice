package com.roydon.leetcode.medium;

import com.roydon.domain.ListNode;

/**
 * RotateList
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/19
 * 61. 旋转链表
 **/
public class RotateList {
    public static void main(String[] args) {

    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) return head;
        int len = 1;
        ListNode sb = head;
        while (sb.next != null) {
            sb = sb.next;
            len++;
        }
        if (k == len) return head;
        int realK = k % len; // 如果k大于长度，那么实际只移动了
        int index = len - realK;
        sb.next = head; // 链表闭合为环;
        while (index-- > 0) {
            sb = sb.next;
        }
        ListNode res = sb.next;
        sb.next = null;
        return res;
    }
}

