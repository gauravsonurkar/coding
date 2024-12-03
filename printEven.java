import java.util.Scanner;
public class printEven {
   public static void main(String[] args) {
       int i = 1; 
       System.out.print("Enter the Number till you want: ");
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       System.out.println("The Even number between 1 to " +N+ " is: ");
       while(i<=N){
        if(i%2==0) {
            System.out.println(i);
        }
        i++;
       }
   } 
}
