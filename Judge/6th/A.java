import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = Integer.parseInt(sc.nextLine());
        String A = "";
        int P=0;

        for(int i = 0; i < test; i++) {
            String[] w = sc.nextLine().split(" ");
            String L = w[0];
            String M = w[1];
            StringBuilder answer = new StringBuilder();

            A = "";

            int wordy = 0;
            int percent = 0;
            int index = 0;

            for(int u = 1; u <= Math.min(L.length(), M.length()); u++) {
                answer.setLength(0);
                percent = 0;
                if((L.length() % u == 0) && (M.length() % u == 0)) {
                    for(int y = 1; y <= L.length(); y++) {
                        if(index == answer.length())
                            index = 0;
                        if(y <= u) {
                            answer.append(L.charAt(y-1));
                        }
                        else {
                            if(answer.charAt(index) == L.charAt(y-1)) {
                                index++;
                                wordy++;
                                if(wordy == answer.length()) {
                                    percent++;
                                    wordy = 0;
                                }
                            }
                            else {
                                break;
                            }
                        }
                    }
                    index = 0;
                    for(int y = 1; y <= M.length(); y++) {
                        if(index == answer.length())
                            index = 0;
                        if(answer.charAt(index) == M.charAt(y-1)) {
                            index++;
                            wordy++;
                            if(wordy == answer.length()) {
                                percent++;
                                wordy = 0;
                            }
                        }
                        else break;
                    }
                }
                if((percent+1) * answer.length() == M.length() + L.length()) {
                    if(A.length() <= answer.length()) {
                        A = answer.toString();
                        P = percent;
                    }
                }
            }
            if((P+1) * A.length() == M.length() + L.length()) {
                System.out.println(A);
            }
            else
                System.out.println("");
        }
    }
}

//1. ??? ????????? ?????? ????????? ????????????. split()
//2. ??? ????????? ????????? ???????????? 1?????? ??? ?????? ???????????? ???????????? for?????? ?????????.
//3. ??? ????????? ????????? ????????? ????????? ????????? ????????? ???! ?????? ????????? ??????
//4. ???????????? ???????????? ????????? ?????? ??? break
//5. for?????? ??? ???????????? answer??? ????????? "" ??????
