import java.util.Scanner;

public class allNauralRevers {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(n>=i) {
            System.out.println(n + " ");
            n--;
        }
    }
}
