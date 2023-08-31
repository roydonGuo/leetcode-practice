package com.roydon.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * FileNumDemo
 *
 * @AUTHOR: roydon
 * @DATE: 2023/6/2
 **/
public class FileNumDemo {
    public static void main(String[] args) throws Exception {
        //文件不存在就创建
        File file = new File("Exercise.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        // 100个整数
        PrintWriter printWriter = new PrintWriter(file);
        for (int i = 0; i < 100; i++) {
            int randomNum = (int) (Math.random() * 100);
            printWriter.print(randomNum + " ");
        }
        printWriter.close();
        // 读取
        int[] nums = new int[100];
        Scanner scanner = new Scanner(file);
        int i = 0;
        while (scanner.hasNextInt()){
//            System.out.println(scanner.nextInt());
            nums[i++] = scanner.nextInt();
        }
        scanner.close();
        // 遍历输出
        Arrays.sort(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }
}
