package Week4.Day2;

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
        List<List<Integer>> answer = new ArrayList<>();
        if(root==null) return answer;
        boolean leftToRight = true;

        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);

        while(!bfs.isEmpty()){
            int size = bfs.size();
            LinkedList<Integer> level = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode traversal = bfs.poll();
                if(leftToRight){
                    level.addLast(traversal.val);
                } 
                else{
                    level.addFirst(traversal.val);
                }
                if(traversal.left!=null) bfs.offer(traversal.left);
                 if(traversal.right!=null) bfs.offer(traversal.right);
            }
            answer.add(level);
            leftToRight = !leftToRight;
        }
        return answer;
    }
}