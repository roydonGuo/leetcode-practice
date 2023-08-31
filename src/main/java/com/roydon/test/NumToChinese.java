package com.roydon.test;

/**
 * NumToChinese
 *
 * @AUTHOR: roydon
 * @DATE: 2023/6/1
 **/
public class NumToChinese {

    public static void main(String[] args) {
        int num = 1001;
        String chinese = convertToChinese(num);
        System.out.println(num + "元转换为中文表示：" + chinese); // 输出：1001元转换为中文表示：一千零一
    }

    public static String convertToChinese(int num) {
        String[] digits = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[] units = {"", "拾", "佰", "仟", "万"};

        StringBuilder sb = new StringBuilder();
        int unitIndex = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                if (sb.length() > 0 && !sb.substring(0, 1).equals("零")) {
                    sb.insert(0, "零");
                }
            } else {
                sb.insert(0, digits[digit] + units[unitIndex]);
            }
            num /= 10;
            unitIndex++;
        }

        if (sb.length() == 0) {
            sb.append("零");
        }

        return sb.toString();
    }

}
