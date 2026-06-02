package Week1.Day2;

import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i<nums.length;i++){
           if(!arr.add(nums[i])) return true;
        }   
        return false;  
    }
}