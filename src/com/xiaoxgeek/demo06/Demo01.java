package com.xiaoxgeek.demo06;

/**
 * Created by XiaoX on 2018/1/19.
 */
public class Demo01 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)return 0;
        if(array.length == 1)return array[0];
        for(int i=array.length-1;i>0;i--){
            if(array[i]<array[i-1])return array[i];
        }
        return array[0];
    }

    public static void main(String[] args) {
        int[] array1 = {3,4,5,1,2};
        int[] array2 = {2,1,1,1,1};
        System.out.print(new Demo01().minNumberInRotateArray(array2));
    }
}
