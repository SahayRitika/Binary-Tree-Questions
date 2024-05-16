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
    public TreeNode helper(TreeNode root,int val, int depth,int currDepth){
        if(depth==1){
            TreeNode first= new TreeNode (val);
            first.left=root;
            return first;
        }

        if(root==null){
            return root;
        }

        if(currDepth== depth-1){
            TreeNode leftbranch= root.left;
            TreeNode rightbranch= root.right;

            root.left= new TreeNode(val);
            root.right= new TreeNode(val);

            root.left.left=leftbranch;
            root.right.right=rightbranch; 

        }
         helper(root.left,val,depth,currDepth+1);
         helper(root.right,val,depth,currDepth+1);

         return root;

    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return helper(root,val,depth,1);
    }
}
