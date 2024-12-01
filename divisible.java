import java.util.*;
public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // if(num%5==0) {
        //     if (num%11==0) {
        //         System.out.println("The number is Divisible of 5 and 11");
        //     }
        // } else {
        //     System.out.println("The number is not divisible by 5 and 11");
        // }

        if(num%5==0 && num%11==0) {
            System.out.println("Number is divisible by 5 and 11");
        } else {
            System.out.println("Number is not divisible by 5 and 11");
        }

    }
}
