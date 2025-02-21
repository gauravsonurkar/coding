import java.util.Scanner;

public class sumTwo {
    public static void main(String[] args) {
        // Write a java program to enter two numbers and find their sum.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of the number is : "+sum);
        
    }
}
