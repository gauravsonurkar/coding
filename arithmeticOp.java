import java.util.Scanner;

public class arithmeticOp {
    public static void main(String[] args) {
        //Write a java program to enter two numbers and perform all arithmetic operations.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The addition of " +a+ " + "+b+" is " + (a+b));
        System.out.println("The Substraction of " +a+ " - "+b+" is " + (a-b));
        System.out.println("The Multiplication of " +a+ " * "+b+" is " + (a*b));
        System.out.println("The Division of " +a+ " / "+b+" is " + (a/b));
        System.out.println("The Modulo of " +a+ " % "+b+" is " + (a%b));
        sc.close();
    }

}