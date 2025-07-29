// Improve Gallons to Liters Converter
// 1 Gallon = 3.7854 Liters
// Addition of Control Statements

import java.util.Scanner;

public class GalToLitTable {
    public static void main (String[] args) {
        double gallons, liters; // declaring necessary variables
        // printing a conversion table
        System.out.println("===================== Gallons to Liters =====================");
        int count = 0; // Page counter
        // Prompting and taking range from user
        System.out.print("Input Range: ");
        Scanner s = new Scanner(System.in); // Declaring "Scanner" Object
        int range = s.nextInt();
        // Conversion
        for (int i = 0; i < range; i++) {
            if (i % 10 == 0) {
                count++;
                System.out.println("=============== Page " + count + " =============");
            }
            gallons = i + 1;
            liters = gallons * 3.7854;
            System.out.println(gallons + " Gallons: " + liters + " Liters");     
        }
    }
}        
        
