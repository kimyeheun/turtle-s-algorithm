import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for(int i = 0; i < test; i++) {
            long A = sc.nextLong();
            long B  = sc.nextLong();
            long R = A%B;
            System.out.println(R >= 0 ? R : R+B);
        }
    }
}
