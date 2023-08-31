package com.roydon.test;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * NumberToCn
 *
 * @AUTHOR: roydon
 * @DATE: 2023/6/1
 **/
public class NumberToCn {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance(Locale.CHINESE);
        String str = nf.format(1001);
        str = str.replace("元", "圆");
        System.out.println(str);
    }
}
