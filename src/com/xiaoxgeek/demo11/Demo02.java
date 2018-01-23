package com.xiaoxgeek.demo11;

/**
 * Created by XiaoX on 2018/1/21.
 * 计算机里负数就是用补码表示，所以按位运算的时候不用考虑负数的问题
 */
public class Demo02 {
    private static int NumberOf1_low(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(NumberOf1_low(-1));
    }
}
