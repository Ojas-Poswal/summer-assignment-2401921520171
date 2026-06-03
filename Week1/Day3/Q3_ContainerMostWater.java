package Week1.Day3;

class Solution {
    public int maxArea(int[] height) {
        int max =0;
       int left = 0;
       int right = height.length-1;
       
      while(left<right){
        int area =0;
        if(height[left]>=height[right]){
            
             area = (right-left)*height[right];
        }

        else if(height[left]<=height[right]){
             area = (right-left)*height[left];
        }
        
        
        if(area>max){
            max = area;
        }
        if(height[left]>height[right]){
            right--;
        }
        else{
            left++;
        }
      }
      return max;
    }
}
