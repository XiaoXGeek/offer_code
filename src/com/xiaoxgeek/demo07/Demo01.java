package com.xiaoxgeek.demo07;

/**
 * Created by XiaoX on 2018/1/19.
 */
public class Demo01 {
    public int Fibonacci(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        else
            return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.print(new Demo01().Fibonacci(4));
    }
}
