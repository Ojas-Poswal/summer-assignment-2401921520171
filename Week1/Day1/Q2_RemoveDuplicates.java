package Week1.Day1;

class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int j=0;
        int i=0;

       while(i<nums.length && j<nums.length){

        if(nums[i]==nums[j]){
            j++;
        }

        else if(nums[i]!=nums[j]){
            nums[i+1]=nums[j];  
            i++;
            j++;
            count++;
        }
        
       }
       return count;
    }
}
