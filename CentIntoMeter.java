import java.util.*;
public class CentIntoMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double meter,km = 0;
        double cm = sc.nextDouble();
        meter = cm / 100.0;
        km = cm /100000.0;
        
        System.out.println("Length in meter  = " + meter +"m");
        System.out.println("Length in kilometer = "+km+"km");

    }
}
