package com.xiaoxgeek.demo17;

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
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 != null && root2 != null)return HasSubtree2(root1,root2);
        else return false;
    }
    public boolean HasSubtree2(TreeNode root1,TreeNode root2) {
        boolean isSubTree = false;
        if(root1 != null && root2 == null) return true;
        if(root1 == null && root2 != null) return false;
        if(root1 == null && root2 == null) return true;
        if(root1.val == root2.val){
            if(HasSubtree(root1.left, root2.left) && HasSubtree(root1.right, root2.right))isSubTree = true;
        }
        if(isSubTree)return true;
        if((HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2)))isSubTree = true;
        return isSubTree;
    }
}
