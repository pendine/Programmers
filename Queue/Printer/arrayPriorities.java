import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
public class arrayPriorities {

    class Number {
        int priority;
        boolean flag;

        Number(int priority, boolean flag) {
            this.priority = priority;
            this.flag = flag;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        int max = 0;

        Queue<Number> q = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            if (location == i) {
                q.offer(new Number(priorities[i], true));
            } else {
                q.offer(new Number(priorities[i], false));
            }
        }

        Arrays.sort(priorities);
        for(int i = priorities.length-1 ; i >0; i--){
            Number anN = q.poll();
            while(priorities[i]!=anN.priority) {
                if (priorities[i] == anN.priority) {
                    answer++;
                    if (anN.flag) {
                        return answer;
                    }
                } else {
                    q.offer(anN);
                }
            }
        }
        return answer;
    }
}
