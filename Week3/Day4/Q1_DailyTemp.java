package Week3.Day4;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int arr[] = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<temperatures.length;i++){

           while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
            int prevIndex = st.pop();
            arr[prevIndex] = i-prevIndex;
           }
            st.push(i);
        }
        return arr;
    }
}
