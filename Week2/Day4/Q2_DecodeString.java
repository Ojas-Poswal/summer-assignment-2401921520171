package Week2.Day4;

class Solution {
    public String decodeString(String s) {
       Stack<Integer> countSt = new Stack<>(); 
       Stack<StringBuilder> stringSt = new Stack<>();

       StringBuilder sb = new StringBuilder();
       int num=0;

       for (char ch : s.toCharArray()) {

         if (Character.isDigit(ch)) {
            num = num*10 + (ch - '0');
          }  
          else if(ch=='['){
            countSt.push(num);
            stringSt.push(sb);
            num=0;
            sb=new StringBuilder();
          } 
          else if(ch==']'){
            int count = countSt.pop();
            StringBuilder prevString = stringSt.pop();
            StringBuilder temp = new StringBuilder();
            for(int i=1;i<=count;i++){
               temp.append(sb);
            }
            prevString.append(temp);
            sb = prevString;

          }
          else{
            sb.append(ch);
          }
        }
        return sb.toString();
    }
}
