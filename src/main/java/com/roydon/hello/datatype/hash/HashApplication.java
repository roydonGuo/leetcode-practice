package com.roydon.hello.datatype.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * HashApplication
 *
 * @AUTHOR: roydon
 * @DATE: 2023/11/29
 **/
public class HashApplication {
    public static void main(String[] args) {
        /* 初始化哈希表 */
        Map<Integer, String> map = new HashMap<>();

        /* 添加操作 */
        map.put(12836, "小哈");
        map.put(15937, "小啰");
        map.put(16750, "小算");
        map.put(13276, "小法");
        map.put(10583, "小鸭");

        /* 查询操作 */
        String name = map.get(15937);

        /* 删除操作 */
        map.remove(10583);

        /* 遍历哈希表 */
        // 遍历键值对 key->value
        for (Map.Entry<Integer, String> kv : map.entrySet()) {
            System.out.println(kv.getKey() + " -> " + kv.getValue());
        }
        // 单独遍历键 key
        for (int key : map.keySet()) {
            System.out.println(key);
        }
        // 单独遍历值 value
        for (String val : map.values()) {
            System.out.println(val);
        }


    }


    /**
     * hash算法
     *
     * @param key
     * @return
     */

    /* 加法哈希 */
    int addHash(String key) {
        long hash = 0;
        final int MODULUS = 1000000007;
        for (char c : key.toCharArray()) {
            hash = (hash + (int) c) % MODULUS;
        }
        return (int) hash;
    }

    /* 乘法哈希 */
    int mulHash(String key) {
        long hash = 0;
        final int MODULUS = 1000000007;
        for (char c : key.toCharArray()) {
            hash = (31 * hash + (int) c) % MODULUS;
        }
        return (int) hash;
    }

    /* 异或哈希 */
    int xorHash(String key) {
        int hash = 0;
        final int MODULUS = 1000000007;
        for (char c : key.toCharArray()) {
            hash ^= (int) c;
        }
        return hash & MODULUS;
    }

    /* 旋转哈希 */
    int rotHash(String key) {
        long hash = 0;
        final int MODULUS = 1000000007;
        for (char c : key.toCharArray()) {
            hash = ((hash << 4) ^ (hash >> 28) ^ (int) c) % MODULUS;
        }
        return (int) hash;
    }

}
