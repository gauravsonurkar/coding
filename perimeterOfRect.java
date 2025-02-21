import java.util.Scanner;

public class perimeterOfRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int P = 2*l + 2*w;
        System.out.println("the perimeter of rectangle is : " + P);


    }
}
