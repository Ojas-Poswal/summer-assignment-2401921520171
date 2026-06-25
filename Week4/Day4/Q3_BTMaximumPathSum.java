package Week4.Day4;

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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        path(root);
        return maxSum;
    }
    int path(TreeNode root){
        if(root==null) return 0;

        int left = Math.max(0,path(root.left));
        int right = Math.max(0,path(root.right));

        int currentPath = left + right + root.val;

        maxSum = Math.max(maxSum,currentPath);

        return root.val + Math.max(left,right);
    }
}
