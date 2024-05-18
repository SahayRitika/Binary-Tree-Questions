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
    int ans;
    public int distributeCoins(TreeNode root) {
        ans=0;
        countSteps(root);
        return (ans);
    }

    public int countSteps(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftCoins= countSteps(node.left);
        int rightCoins= countSteps(node.right);
        ans+= Math.abs(leftCoins)+ Math.abs(rightCoins);
        return (node.val -1) + leftCoins + rightCoins;
    }
}
