import java.util.*;
public class tempreture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celcius = sc.nextInt();
        double fahrenheit = (celcius * 9/5) + 32;
        System.out.println("Fahrenheit is : " + fahrenheit + " Fahrenheit");


    }
}
