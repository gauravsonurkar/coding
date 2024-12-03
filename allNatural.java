import java.util.Scanner;

public class allNatural {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
       int  i = 1; 
       System.out.println("Enter the number: ");
       int n = sc.nextInt();
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}
