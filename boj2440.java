import java.util.*;

public class boj2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}