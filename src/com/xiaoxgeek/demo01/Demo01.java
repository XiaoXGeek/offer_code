package com.xiaoxgeek.demo01;

/**
 * Created by XiaoX on 2018/1/18.
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Demo01 {
    public boolean Find(int target, int [][] array) {
        if(array == null)return false;
        int rowLen = array.length;
        int columnLen = array[0].length;
        if(columnLen == 0)return false;
        if(target < array[0][0] || target > array[rowLen-1][columnLen-1])return false;
        for(int i=0;i<rowLen;i++){
            if(array[i][columnLen-1]<target)continue;
            for(int j=0;j<columnLen;j++){
                if(array[i][j] == target)return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int[][] array = {{}};
        System.out.print(new Demo01().Find(7,array));
    }

}
