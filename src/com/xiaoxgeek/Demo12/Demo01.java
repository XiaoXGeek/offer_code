package com.xiaoxgeek.Demo12;

/**
 * Created by XiaoX on 2018/1/23.
 */
public class Demo01 {
    // 将浮点数的指数部分右移
    public double Power(double base, int exponent) {
        double res = 1;
        double curr = base;
        int n = exponent;
        if(exponent == 0){
            return 1;
        }else if(exponent < 0){
            if(base==0)
                throw new RuntimeException("分母不能为0");
            n = -exponent;
        }
        while(n != 0){
            if((n&1)==1)
                res*=curr;
            curr*=curr;// 翻倍
            n>>=1;// 右移一位
        }
        return exponent>0?res:(1/res);
    }

    public static void main(String[] args) {
        System.out.print(new Demo01().Power(2,-3));
    }
}
