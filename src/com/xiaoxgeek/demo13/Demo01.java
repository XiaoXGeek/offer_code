package com.xiaoxgeek.demo13;

/**
 * Created by XiaoX on 2018/1/23.
 */
public class Demo01 {
    public void reOrderArray(int [] array) {
        // 数组长度为1或0，无需调整
        if(array.length<2)return;
        // 从左到右找偶数，从右到左找偶数
        int tmp = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2 == 0){
                int j = 0;
                for(j=i+1;j<array.length;j++){
                    if(array[j]%2 == 1){
                        tmp = array[i];
                        array[i] = array[j];
                        break;
                    }
                }
                if(j<array.length){
                    for(int k=j;k>i+1;k--){
                        array[k] = array[k-1];
                    }
                    array[i+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {1,3,2,4,6,5,7};
        new Demo01().reOrderArray(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
