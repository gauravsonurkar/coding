import java.util.Scanner;

public class checkevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The "+num+" is Even Number");
        } else {
            System.out.println("The "+num+" is Odd Number");

        }

    }

}
