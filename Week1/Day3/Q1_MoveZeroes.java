package Week1.Day3;

class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[count] = nums[i];
            count++;
        }
      }
      for(int i=count;i<nums.length;i++){
            nums[i]=0;
      }
    }
}