package com.xiaoxgeek.demo04;

/**
 * Created by XiaoX on 2018/1/18.
 */
public class Demo01 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length <= 0 && in.length<=0)return null;
        int middle=0;
        TreeNode node = new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(in[i] == pre[0]){
                middle = i;
                break;
            }
        }
        int[] pre_left = new int[middle];
        int[] pre_right = new int[in.length - (middle+1)];
        int[] in_left = new int[middle];
        int[] in_right = new int[in.length - (middle+1)];
        for(int i=0;i<pre.length-1;i++){
            if(i<middle){
                pre_left[i] = pre[i+1];
            }else{
                pre_right[i-middle] = pre[i+1];
            }
        }
        for(int i=0;i<in.length;i++){
            if(i<middle)in_left[i] = in[i];
            else if(i>middle){
                in_right[i-(middle+1)] = in[i];
            }
        }
        node.left = reConstructBinaryTree(pre_left, in_left);
        node.right = reConstructBinaryTree(pre_right, in_right);
        return node;
    }

    public void printTree(TreeNode node){
        if(node!=null) System.out.println(node.val);
        if(node.left!=null)printTree(node.left);
        if(node.right!=null)printTree(node.right);
    }

    public static void main(String[] args) {
        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {3,2,4,1,6,5,7};
        TreeNode node = new Demo01().reConstructBinaryTree(pre, in);
        new Demo01().printTree(node);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}