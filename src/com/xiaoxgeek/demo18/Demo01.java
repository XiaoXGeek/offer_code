package com.xiaoxgeek.demo18;

/**
 * Created by XiaoX on 2018/1/25.
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Demo01 {
    public void Mirror(TreeNode root) {
        if(root != null){
            if(root.left == null){   // 左子树为空
                root.left = root.right;
                root.right = null;
                Mirror(root.left);
            }else if(root.right == null){ // 右子树为空
                root.right = root.left;
                root.left = null;
                Mirror(root.right);
            }else{
                // 左右子树都不为空
                TreeNode tmp = root.left;
                root.left = root.right;
                Mirror(root.left);
                root.right = tmp;
                Mirror(root.right);
            }
        }
    }
}
