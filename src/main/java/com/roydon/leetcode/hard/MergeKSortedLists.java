package com.roydon.leetcode.hard;

import com.roydon.domain.ListNode;

/**
 * MergeKSortedLists
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/19
 * 23.合并K个排序链表
 **/
public class MergeKSortedLists {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        int len = lists.length;
        for (int i = 0; i < len; i++) {
            res = mergeTwoLists(res, lists[i]);
        }
        return res;
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
