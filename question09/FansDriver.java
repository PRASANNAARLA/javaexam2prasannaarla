/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

import java.util.Scanner;

/**
 *
 * @author S542294
 */
public class FansDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the brand");
        String brand = scan.next();
        System.out.println("Enter the number of wings");
        int wings = scan.nextInt();
        Fans fan = new Fans(brand, wings);
        System.out.println(fan.toString());

    }

}
