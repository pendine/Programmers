public class Gym_suit {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        lost_Suit(lost,reserve);
        for(int i=0; i<lost.length; i++){
            if(lost[i]>-1){
                n--;
            }
        }
        answer = n;
        return answer;
    }

    public void lost_Suit(int[] lost, int[] reserve){  
        for(int i=0; i<lost.length; i++){  //먼저 여분을 갖고있던 학생이 도난당했는지 확인
            for(int j=0; j<reserve.length; j++){  //도난당한 학생은 빌려줄수 없기때문에
                if(canITook(lost[i],reserve[j])==0){
                    lost[i]=-1;     //도난당한 학생의 문제가 해결되었음을 0이 아니라 -1로 표시한이유
                    reserve[j]=-1;  //1번 학생이 도난당했을경우 0으로 설정할때 해결됬다고 표시할수 있기 때문
                }
            }
        }
        for(int i=0; i<lost.length; i++){  //여분의 체육복을 빌려줄수 있는 학생이 도난당한 학생에게 빌려줌
            for(int j=0; j<reserve.length; j++){
                if(canITook(lost[i],reserve[j])==1){
                    lost[i]=-1;
                    reserve[j]=-1;
                }
            }
        }
    }

    public int canITook(int lost, int reserve){ //리턴값을 이용하여 여분의 체육복을 갖고온 학생이 도난당한건지
        int abs = lost-reserve;  //여분이 없는 학생이 도난당한것인지 확인
        if(Math.abs(abs)==1){
            return 1;  //빌려줄 수 있는 여분이 존재
        }else if(Math.abs(abs)==0){
            return 0;
        }
        return 2;  //빌려줄 수 있는 여분이 없음
    }
}
