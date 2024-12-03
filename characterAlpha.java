
import java.util.Scanner;

public class characterAlpha {
    // * C program to check whether a character is alphabet or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <'z') {
            System.out.println(ch + "Is alphabet");
        } else {
            System.out.println(ch+"is not character.");
        }

    }

}
