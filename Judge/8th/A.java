import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());

        Integer[] alpa = new Integer[27];
        Arrays.fill(alpa, 0);

        for(int i = 0; i < a; i++) {
            String word = sc.next();
            ArrayList<Character> list = new ArrayList<>();
            for(int u = 0; u < word.length(); u++) {
                list.add(word.charAt(u));
            }
            for(int y : list) {
                alpa[y-97]++;
            }
        }

        for(int t : alpa) {
            if(t % a != 0) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
