import java.util.*;
public class checkNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    // if (num > 0) {
    //     System.out.println("The number is Positive");
    // }
    // if (num < 0) {
    //     System.out.println("The number is Negative");
    // }

    // if (num == 0 ) {
    //     System.out.println("The number is Zero");
    // }

    if (num > 0) {
        System.out.println("The number is Positive");
    } else if (num < 0) {
        System.out.println("The number is Negative");
    } else {
        System.out.println("The number is Zero");
    }
    

    }
}
