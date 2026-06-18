package Week3.Day4;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n=heights.length;
         
         int maxLen = 0;
         int area=0;
         int width=0;
        for(int i=0;i<=heights.length;i++){
           
            while(!st.isEmpty() && (i==n || heights[i]<heights[st.peek()]) ){
              int top =st.pop();
              int height = heights[top];
              if(st.isEmpty()) width=i;
              else width = i-st.peek()-1;
              area = height*width;
              maxLen = Math.max(maxLen,area);
            }
            
            if(i<n) st.push(i);
        }
        return maxLen;
    }
}
