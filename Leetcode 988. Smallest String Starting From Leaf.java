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
    public String smallestFromLeaf(TreeNode root){
        dfs(root,"");
        // System.out.println(list);
        Collections.sort(list);

        return list.get(0);

    }
    List<String> list= new ArrayList<>();
    public void dfs(TreeNode root, String s){
        if(root== null){
            return;
        }
        if(root.right==null && root.left== null){
            s+= (char)(root.val+97);
            s=new StringBuffer(s).reverse().toString();
            list.add(s);
            return;
        }
         dfs(root.left, s+(char)(root.val+97));
         dfs(root.right, s+(char)(root.val+97));
    }
}
