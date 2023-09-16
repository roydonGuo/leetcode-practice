package com.roydon.java.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * HashMapInsertion
 *
 * @AUTHOR: roydon
 * @DATE: 2023/9/6
 * 不考虑内存限制，快速把成千上万数据插入hashmap
 **/
public class HashMapInsertion {
    public static void main(String[] args) {
        int threadCount = 10; // 线程数量
        int number = 1000;

        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 1; i <= number; i++) {
            final int key = i;
            final int val = i;
            executorService.submit(new Thread(() -> {
                hashMap.put(key, val);
            }));
        }
        executorService.shutdown();
        int n = 0;
        while (!executorService.isTerminated()) {
            System.out.println("over-" + n++);
        }
        System.out.println("over");

        Iterator<Map.Entry<Integer, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            System.out.println(next.getKey() + " - " + next.getValue());
        }

    }
}
