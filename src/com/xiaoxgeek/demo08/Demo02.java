package com.xiaoxgeek.demo08;

/**
 * Created by XiaoX on 2018/1/19.
 */
public class Demo02 {
    public int JumpFloor(int target) {
        if(target<=0)return 0;
        if(target==1)return 1;
        if(target==2)return 2;
        int one=1,two=2,result=0;
        for(int i=3;i<=target;i++){
            result = one + two;
            one = two;
            two = result;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.print(new Demo01().JumpFloor(4));
    }
}
