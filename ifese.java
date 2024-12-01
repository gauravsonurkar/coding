import java.util.Scanner;

public class ifese {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b) {
            System.out.println(a+ " Is greater");
        } else {
            System.out.println(b+ " Is greater");
        }
        
    }
}
