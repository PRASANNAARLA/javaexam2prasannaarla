/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_example03;

import java.util.Scanner;

/**
 *
 * @author prasanna arla
 */
public class GardenDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter garden Area :");
        int area = scan.nextInt();
        System.out.println("Enter type of garden soil :");
        String soil = scan.next();
        System.out.println("Enter number of flower Variaties aviable :");
        int Variaties = scan.nextInt();
        System.out.println("Enter the type of fruits cultivating :");
        String fruits = scan.next();
        Flowers flw = new Flowers(Variaties, area, soil);
        Fruits fru = new Fruits(fruits, area, soil);
        System.out.println(flw.toString());
        System.out.println(fru.toString());

    }

}
