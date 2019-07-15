import java.util.HashMap;
import java.util.Map;

public class failSportman {
    public String solution(String[] participant, String[] completion) {
        HashMap<Integer, String> pMap = new HashMap<>();

        int i=0;
        for(String pName : participant) {
            pMap.put(i++, pName);
        }

        for(String entry : completion) {
            i = getKey(pMap,entry);
            if(pMap.get(i).equals(entry)) {
                pMap.remove(i);
            }
        }

        String answer = pMap.remove(i);

        return answer;
    }
    public int getKey(HashMap<Integer, String> m, String value) {
        int i=0;
        for(Object o: m.keySet()) {
            if(m.get(o).equals(value)) {
                return i;
            }
            i++;
        }
        return i;
    }

}
