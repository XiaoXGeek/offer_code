package com.xiaoxgeek.demo11;

/**
 * Created by XiaoX on 2018/1/21.
 */
public class Demo01 {
    public int NumberOf1(int n) {
        int count=0;
        int divisor = n;
        int remainder = 0;
        if(n==0){
            return 0;
        }else if(n>0){
            while(divisor > 0){
                remainder = divisor%2;
                divisor = divisor/2;
                if(remainder == 1)count++;
            }
        }else{
            divisor = -n;
            int[] a = new int[32];
            int i=31;
            while(i>0){
                remainder = divisor%2;
                divisor = divisor/2;
                if(remainder == 1)
                    a[i] = 0;
                else
                    a[i] = 1;
                i--;
            }
            a[0] = 1;
            int in = 1;
            for(int j=31;j>0;j--){
                if(a[j]==0 & j==32){
                    a[j] = 1;
                    break;
                }
                a[j] = a[j] + in;
                if(a[j]==2){
                    a[j] = 0;
                    in = 1;
                }else if(a[j]==1){
                    in = 0;
                    break;
                }else{
                    break;
                }

            }
            for(int j=0;j<32;j++){
                 if(a[j]==1)count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(new Demo01().NumberOf1(-1));
    }
}
