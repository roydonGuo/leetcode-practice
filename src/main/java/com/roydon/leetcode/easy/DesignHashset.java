package com.roydon.leetcode.easy;

import java.util.*;

/**
 * DesignHashset
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/19
 * 705. 设计哈希集合
 **/
public class DesignHashset {

    public static void main(String[] args) {
//        MyHashSet myHashSet = new MyHashSet();
//        myHashSet.add(1);
//        myHashSet.add(1);
//        myHashSet.add(2);
////        System.out.println(myHashSet.contains(2));
////        System.out.println(myHashSet.contains(3));
//        myHashSet.remove(1);
//        System.out.println(myHashSet.contains(1));
//        HashSet<Object> hashSet = new HashSet<>();
//        hashSet.add(1);
//        hashSet.remove(1);
//        System.out.println(hashSet.contains(1));
        char[] chars = {'a', 'b', 'c'};
        String s = new String(chars);
        System.out.println(s);
        chars[0] = 'b';
        System.out.println(s);
        // abc
        // abc
        // Arrays.copyOf()
    }
}

class MyHashSet {
    private static final int INIT_LEN = 11; //素数
    private LinkedList[] data;

    public MyHashSet() {
        data = new LinkedList[INIT_LEN];
        for (int i = 0; i < INIT_LEN; i++) {
            data[i] = new LinkedList();
        }
    }

    public void add(int key) {
        int hashCode = hashCode(key);
        Iterator iterator = data[hashCode].iterator();
        while (iterator.hasNext()) {
            int next = (int) iterator.next();
            if (next == key) return;
        }
        data[hashCode].offerLast(key);
    }

    public void remove(int key) {
        int h = hashCode(key);
        Iterator iterator = data[h].iterator();
        while (iterator.hasNext()) {
            int element = (int) iterator.next();
            if (element == key) {
                data[h].remove(element);
                return;
            }
        }
    }

    public boolean contains(int key) {
        int h = hashCode(key);
        Iterator iterator = data[h].iterator();
        while (iterator.hasNext()) {
            int element = (int) iterator.next();
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    /**
     * 哈希运算
     *
     * @param key
     * @return
     */
    private static int hashCode(int key) {
        return key % INIT_LEN;
    }
}
