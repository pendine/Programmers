import java.util.Arrays;

public class Joystick {
    public int solution(String name) {
        int answer = 0;
        int[] diffents = new int[name.length()];

        diffents = check_distance(name, diffents);
        System.out.println(Arrays.toString(diffents));
        answer= movement(diffents);
        return answer;
    }

    public int[] check_distance(String name, int[] diffents) {
        int location = 0;
        int value = 0;
        int[] alphabetLocation = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(char c : name.toCharArray()){
            diffents[location] = alphabetLocation[c-'A'];
            location++;
        }
        return diffents;
    }

    public int movement(int[] diffents) {
        int front_location = 0;
        int back_location = 0;
        int location = 0;
        int total = 0;
        int count = 0;

        while (true){
            if (diffents[front_location] > 0) //앞으로 가면서 A가 아닌 알파벳 수 확인
            {
                total = total + diffents[front_location] + count;
                location = front_location;
                diffents[location] = 0;
                back_location = location;
                count = 0;
                continue;
            }
            if (diffents[back_location] > 0)  //뒤로 가면서 A가 아닌 알파벳 수 확인
            {
                total = total + diffents[back_location] + count;
                location = back_location;
                diffents[location] = 0;
                front_location = location;
                count = 0;
                continue;
            }

            count ++;
            front_location += 1;
            if (front_location == diffents.length) front_location = 0;
            back_location -= 1;
            if (back_location < 0) back_location = diffents.length - 1;

            if(count >= diffents.length) break;
        }

        return total;
    }
}
