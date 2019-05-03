import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        List<Integer> list = new ArrayList<Integer>();
        int tmp = -1;
        for(int i=0; i<arr.length; i++){
            if(tmp!=arr[i]){
                tmp = arr[i];
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
