import java.util.Arrays;

public class SortArrays {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i<commands.length; i++){
            answer[i] = splitArray(array, commands[i]);
        }

        return answer;
    }

    int splitArray(int[] inputArray, int[] returnarray){
        int from = returnarray[0]-1;
        int to = returnarray[1];
        int target = returnarray[2]-1;

        int[] array = Arrays.copyOfRange(inputArray, from,to);
        Arrays.sort(array);

        return array[target];
    }
}
