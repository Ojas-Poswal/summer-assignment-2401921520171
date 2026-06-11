package Week2.Day4;

class Solution {
    public String reverseWords(String s) {
        String []str = s.split(" ");
        for(int i=0;i<str.length;i++){
            str[i] = new StringBuilder(str[i]).reverse().toString();
        }
        String result = String.join(" ",str);
        return result;    
    }
}
