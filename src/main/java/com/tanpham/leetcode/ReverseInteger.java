package com.tanpham.leetcode;

public class ReverseInteger {
    public static int reverse(int number) {
        if (number == 0 || number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
            return 0;
        }
        int result = 0;
        boolean suddenBreak = false;
        while (number != 0) {
            result = result * 10;
            if (result / 10 != result) {
                suddenBreak = true;
                break;
            }
            result += number % 10;
            number = number/10;
        }
        
        return suddenBreak ? 0 : result;
    }
}
