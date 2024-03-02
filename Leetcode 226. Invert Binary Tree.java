/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void helper(TreeNode root){
        if(root==null){return;}
        TreeNode currNode= root.left;
        root.left= root.right;
        root.right= currNode;
        helper(root.left);
        helper(root.right);
        return;
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null){return root;}
        helper(root);
        // helper(root.left);
        // helper(root.right);
        return(root);
    }
}
