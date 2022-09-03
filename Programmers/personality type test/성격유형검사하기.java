import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] alp = {"R", "T", "C", "F", "J", "M", "A", "N"};
        int[] count = new int[8];
        Arrays.fill(count, 0);

        for(int i = 0; i < survey.length; i++) {
            String buf = survey[i];
            char one = buf.charAt(0);
            char two = buf.charAt(1);
            String B = String.valueOf(one);
            String T= String.valueOf(two);
            int c = choices[i];

            switch(c) {
                case 1:
                case 2:
                case 3:
                    count[Arrays.asList(alp).indexOf(B)] += 4-c;
                    break;
                case 5:
                case 6:
                case 7:
                    count[Arrays.asList(alp).indexOf(T)] +=c-4;
                    break;
            }
        }

        String answer= "";

        for(int u = 0; u < (count.length); u+=2 ) {
            if(count[u] >= count[u+1]) {
                answer = answer.concat(alp[u]);
            }
            else {
                answer = answer.concat(alp[u+1]);
            }
        }

        return answer;
    }
}

//[문풀 순서]
//1. 성격 유형이 담긴 배열. 0으로 초기화
//2. (어떤 성격 묶음 인지 파악.) 인덱싱
//3. 해당 성격 타입에 점수 저장. case문
//4. 인덱스를 두개씩 끊어서 생각하여 둘을 비교.
//5. String으로 만들어 묶어서 출력