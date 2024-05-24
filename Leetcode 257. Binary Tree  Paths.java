//Approach one, detailed approach, this algorithm helps in other backtracking problems
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result= new ArrayList<String>();
        helper(result, new StringBuilder(), root);

        return result;
    }
    public void helper(List<String> result, StringBuilder sb, TreeNode root){

        int tmp= sb.length();

        if(root.left== null && root.right== null){
            sb.append(root.val);
            result.add(sb.toString());
        }
        else{
            sb.append(root.val+"->");

            if(root.left!= null){
                helper(result, sb, root.left);
            }

            if(root.right!= null){
                helper(result, sb, root.right);
            }
        }

        sb.setLength(sb.length()- (sb.length()-tmp));
        //return;
    }
}

//Approach two, more optimised approach

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans= new ArrayList<>();
        if(root!= null){
            helper(ans,"",root);
        }
        return ans;
    }

    public void helper(List<String> ans,String path, TreeNode root){
        if(root.left== null && root.right== null){ ans.add(path+root.val);}
        if(root.left != null){ helper(ans,path+root.val+"->",root.left);}
        if(root.right != null){ helper(ans,path+root.val+"->",root.right);}
    }
}
