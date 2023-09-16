package com.roydon.leetcode.medium;

import com.roydon.domain.TreeNode;

import java.rmi.dgc.Lease;
import java.util.*;

/**
 * BinaryTreeLevelOrderTraversal
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/6
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）
 * <p>
 * https://leetcode.cn/problems/binary-tree-level-order-traversal/
 **/
public class BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {
//        levelOrder(new TreeNode());
    }


    public static List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) return null;

        List<List<Integer>> res = new ArrayList<>();

        // 队列
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        // 头节点入队
        linkedList.offer(root);

        while (!linkedList.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int queueLen = linkedList.size();
            for (int i = 0; i < queueLen; i++) {
                TreeNode first = linkedList.removeFirst();
                list.add(first.getVal());
                if (first.getLeft() != null) {
                    linkedList.add(first.getLeft());
                }
                if (first.getRight() != null) {
                    linkedList.add(first.getRight());
                }
            }
            res.add(list);
        }
        return res;

    }

    // BFS
//    public static void cenciTraverseWithQueue(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>(); // 创建队列
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll(); // 元素出队即打印
//            System.out.println(node.val); // 打印出队的元素
//            if (root.leftNode != null) {
//                queue.offer(node.leftNode);
//            }
//            if (root.rightNode != null) {
//                queue.offer(node.rightNode);
//            }
//        }
//    }


}
