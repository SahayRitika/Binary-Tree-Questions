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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        List<List<Integer>> ans= new ArrayList<>();
        if(root == null){
            return ans;
        }
        int x=1;
        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            List<Integer> list= new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=queue.remove();
                list.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            if(x%2 ==0){
                Collections.reverse(list);
            }
            x++;
            ans.add(list);
        }
        return ans;
    }
}
