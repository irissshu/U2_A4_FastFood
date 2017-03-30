/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a4_fastfood;

import java.util.Scanner;

/**
 *
 * @author feshu2250
 */
public class U2_A4_FastFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int burgers;
        int fries;
        int softDrinks;
        int amountTendered;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of burgers: ");
        burgers = input.nextInt();
        
        System.out.print("Enter the number of fries: ");
        fries = input.nextInt();
        
        System.out.print("Enter the number of soft drinks: ");
        softDrinks = input.nextInt();
       
        System.out.print("Enter the amount tendered: ");
        amountTendered = input.nextInt();
        input.close();
        
        //equation for cost
        final double costBeforeTax = 2.49*burgers + 1.89*fries + 0.99*softDrinks;
        final double tax = costBeforeTax * 0.13;
        final double costAfterTax = tax + costBeforeTax;
        final double change = amountTendered - costAfterTax;
        
        System.out.println("Total before taxes: " + costBeforeTax);
        System.out.println("Tax: " + tax);
        System.out.println("Final total: " + costAfterTax);
        System.out.println("Change: " + change);
        
    }
    
}
