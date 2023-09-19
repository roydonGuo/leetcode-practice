package com.roydon.leetcode.easy;

import com.roydon.domain.ListNode;

/**
 * MergeTwoSortedLists
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/19
 * 21. 合并两个有序链表
 **/
public class MergeTwoSortedLists {

    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.getVal() < list2.getVal()) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
    }
}
