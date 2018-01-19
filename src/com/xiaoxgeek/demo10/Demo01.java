package com.xiaoxgeek.demo10;

/**
 * Created by XiaoX on 2018/1/19.
 */
public class Demo01 {
    public int RectCover(int target) {
        if(target<=0)return 0;
        if(target==1)return 1;
        int m = target/2;
        int result = 0;
        for(int i=0;i<=m;i++){
            result += Combinatorial(target - i, i);
        }
        return result;
    }

    public long Combinatorial(int m,int n){
        if(n==0)return 1;
        long nj = 1;
        long mnj = 1;
        for(int i=1;i<=m;i++){
            if(i<=n)nj = nj*i;
            if(i>=m-n+1)mnj=mnj*i;
        }
        return mnj/nj;
    }

    public static void main(String[] args) {
        System.out.print(new Demo01().RectCover(30));
    }
}
