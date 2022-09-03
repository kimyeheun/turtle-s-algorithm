import java.util.*;
//[1]
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = " ";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;

        for(i = 0; i < completion.length; i++) {
            if(!completion[i].equals(participant[i])) {
                answer = participant[i];
                break;
            }
        }
        answer = participant[i];
        return answer;
    }
}

//for문에서 int 바깥에 선언하면 for문이 끝나도 사용 가능.

//[2]
class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        for (String player : completion)
            map.put(player, map.get(player) - 1);

        for (String key : map.keySet()) {
            if (map.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}