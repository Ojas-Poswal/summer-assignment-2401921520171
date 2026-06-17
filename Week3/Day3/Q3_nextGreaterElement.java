package Week3.Day3;


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int arr[] = new int[nums1.length];

        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--){
           int current = nums2[i];
           while(!st.isEmpty() && st.peek()<=current){
            st.pop();
           }
           if(st.isEmpty()){
            map.put(current,-1);
           }
           else{
            map.put(current,st.peek());

           }
           st.push(current);
        }
        for(int i=0;i<nums1.length;i++){
            arr[i] = map.get(nums1[i]);
        }
        return arr;
    }
}