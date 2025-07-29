// A simple program for converting Gallons to Liters in Java
// 1 Gallon = 3.7854 Liters

import java.util.Scanner;

public class GalToLit {
    public static void main (String[] args) {
        double gallons, liters;
        // Creating a "Scanner" class object
        Scanner s = new Scanner(System.in);
        // taking input the number of Gallons
        System.out.print("Gallons: ");
        gallons = s.nextDouble();
        
        liters = 3.7854 * gallons;
        // printing the value       
        System.out.println(gallons + " Gallons: " + liters + " Liters");
    }
}
