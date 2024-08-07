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
    List<Integer> list;
    public void  preorder(TreeNode root){
        if(root==null){
            return;
        }
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public void flatten(TreeNode root) {
        list= new ArrayList<>();
        preorder(root);
        System.out.println(list);

        int i=1;
        TreeNode curr= root;
        while(i< list.size()){
            curr.left=null;
            curr.right= new TreeNode(list.get(i));
            i++;
            curr= curr.right;
        }
    }
}
