package Week3.Day3;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else {
                 if(st.isEmpty()) return false;

                char top = st.peek();

                // mismatch
                if((top == '(' && s.charAt(i) != ')') ||
                   (top == '{' && s.charAt(i) != '}') ||
                   (top == '[' && s.charAt(i) != ']')){
                    return false;
                }

                // match
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
