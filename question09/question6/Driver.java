/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author prasanna arla
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter three sides of the triangle: ");
        int sideA = scan.nextInt();
        int sideB = scan.nextInt();
        int sideC = scan.nextInt();

        System.out.print("Please enter a color: ");
        String color = scan.next();

        System.out.print("Is the triangle filled ? Please enter true or false: ");
        boolean isfilled = scan.nextBoolean();
        Triangle tri = new Triangle(sideA, sideB, sideC, color, isfilled);

        System.out.println(tri);
        scan.close();

    }
}
