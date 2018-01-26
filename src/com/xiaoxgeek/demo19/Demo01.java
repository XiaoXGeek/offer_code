package com.xiaoxgeek.demo19;

/**
 * Created by XiaoX on 2018/1/25.
 */
import java.util.ArrayList;

public class Demo01 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int line =  matrix.length;
        if(line==0){
            return null;
        }
        ArrayList<Integer> result = new ArrayList<>();
        int column = matrix[0].length;
        int circle = line;
        if(line > column){
            circle = column;
        }
        if(circle == 2){
            circle = 1;
        }
        for(int i=0;i<circle;i++){
            // 第i圈上边元素
            for(int j=i;j<column-i;j++){
                result.add(matrix[i][j]);
            }
            // 第i圈右边元素
            for(int j=i+1;j<line-i;j++){
                result.add(matrix[j][column-i-1]);
            }
            if(line == 1){
                // 第i圈下边元素
                for(int j=column-i-2;j>=i;j--){
                    result.add(matrix[line-i-1][j]);
                }
            }
            // 第i圈左边元素
            if(column == 1){
                for(int j=line-i-2;j>i;j--){
                    result.add(matrix[j][i]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(3/2);
    }
}
