package com.xiaoxgeek.demo09;

/**
 * Created by XiaoX on 2018/1/19.
 */
public class Demo01 {
    public int JumpFloorII(int target) {
        if(target<=0)return 0;
        int[] a = new int[target+1];
        int sum=0;
        for(int i=1;i<=target;i++){
            a[i] = sum + 1;
            sum += a[i];
        }
        return a[target];
    }

    public static void main(String[] args) {
        System.out.print(new Demo01().JumpFloorII(2));
    }
}
