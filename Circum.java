import java.util.Scanner;

public class Circum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int l = sc.nextInt();
        int w = sc.nextInt();
        double cer = 2 * 3.14 * r;
        int die = 2 * r;
        int area = l * w;
        System.out.println("Diameter of circle is: " + die);
        System.out.println("Circumference of circle is: " + cer);
        System.out.println("area of circle is: " + area)
    }
}
