/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        TreeNode t3 = null;
        
        if (t1 == null && t2 == null){
            return null;
        } else if (t1 == null && t2 != null){
            return t2;
        } else if (t1 != null && t2 == null){
            return t1;
        }
        
        if (t1 != null && t2 != null){
             t3 = new TreeNode(t1.val + t2.val);
        }
        
        //preorder traversal
        TreeNode left = mergeTrees(t1.left, t2.left);
        TreeNode right = mergeTrees(t1.right, t2.right);
        
        
        t3.left = left;
        t3.right = right;
        
        return t3;  
    }
}
