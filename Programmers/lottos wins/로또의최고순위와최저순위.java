class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int min = 7;
        int max = 7;

        for(int i = 0; i < lottos.length; i++) {
            for(int u = 0; u < win_nums.length; u++) {
                if(lottos[i] == 0) {
                    max--;
                    break;
                }
                else if(win_nums[u] == lottos[i]) {
                    max--;
                    min--;
                }
            }
        }

        if(min == 7)
            min = 6;
        if(max == 7)
            max = 6;

        int[] answer = {max, min};

        return answer;
    }
}
