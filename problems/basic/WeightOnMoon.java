// Calculating effective human Weight on Moon. 
// Weight on Moon is about 17% of Earth.
// Weight, W = mass * g (9.8 ms^-2)

import java.util.Scanner;

public class WeightOnMoon {
    public static void main (String[] args) {
        // Taking users mass as input. 
        Scanner s = new Scanner(System.in);
        System.out.print("Mass: ");
        double mass = s.nextDouble();
        double g = 9.8;
        double moonG = g * (17.0/100);  // calculating g on moon //17.0 is required to represent double division
        double moonWeight = mass * moonG;
        System.out.println("Moon Weight = " + moonWeight + "N");
    }
}
