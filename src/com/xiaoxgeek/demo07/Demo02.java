package com.xiaoxgeek.demo07;

/**
 * Created by XiaoX on 2018/1/19.
 */
public class Demo02 {
    public int Fibonacci(int n) {
        if(n==0)return 0;
        if(n<=2)return 1;
        int a=1,b=1,c=0;
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.print(new Demo01().Fibonacci(3));
    }
}
