package com.xiaoxgeek.demo08;

/**
 * Created by XiaoX on 2018/1/19.
 */
public class Demo01 {
    public int JumpFloor(int target) {
        if(target<=0)return 0;
        if(target==1)return 1;
        if(target==2)return 2;
        return JumpFloor(target-1) + JumpFloor(target-2);
    }

    public static void main(String[] args) {
        System.out.print(new Demo01().JumpFloor(4));
    }
}
