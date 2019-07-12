import java.util.Arrays;

public class Lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int length = people.length;
        int startPoint=0;

        for (int i = length-1 ; i >=0; i--) {
            if(people[i]==0){
                continue;
            }

            for(int j=startPoint; j <= i; j++) {
                int sum = people[i] + people[j];
                if(people[j]==0){
                    continue;
                }
                if (sum <= limit && sum > 0) {
                    answer++;
                    people[i] = 0;
                    people[j] = 0;
                    System.out.println(Arrays.toString(people));
                    startPoint++;
                    break;
                }else if(j==i){
                    answer++;
                    people[i]=0;
                    System.out.println(Arrays.toString(people));
                    startPoint++;
                    break;
                }
            }

        }
        return answer;
    }
}
