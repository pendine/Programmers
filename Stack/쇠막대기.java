import java.util.*;
class Solution {
    public int solution(String arrangement) {
        Stack<Character> stack = new Stack<Character>();
        int answer = 0;
        
        for(int i =1; i< arrangement.length(); i++ ){
            if(arrangement.charAt(i)=='('){
                if(arrangement.charAt(i)==arrangement.charAt(i-1)){
                    stack.add('(');
//                    System.out.println( " stack : " + stack +" 막대기수 : "+answer);
                }
            }
            if(arrangement.charAt(i)==')'){
                if(arrangement.charAt(i)==arrangement.charAt(i-1)){
                    answer+=1;
                    stack.pop();
//                    System.out.println( " stack : " + stack +" 막대기수 : "+answer);
                }else{
                    answer +=stack.size();
//                    System.out.println("잘랐음");
//                    System.out.println( " stack : " + stack +" 막대기수 : "+answer);
                }
            }
        }
        return answer;
    }
}
