/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_example02;

import java.util.Scanner;

/**
 *
 * @author prasanna arla
 */
public class ShapesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the edge: ");
        double edge = scan.nextDouble();
        System.out.print("Enter the type of polygon: ");
        String typeOfPolydron = scan.next();
        System.out.print("enter the number of sides: ");
        int numberOfSides = scan.nextInt();
        System.out.print("enter length: ");
        double length = scan.nextDouble();

        Shapes sh = new Polyhedron(edge, typeOfPolydron, numberOfSides, length);

        System.out.println(sh.toString());
        System.out.print("Enter the width: ");
        double width = scan.nextDouble();
        System.out.print("Enter the height: ");
        double height = scan.nextDouble();
        Cuboid cub = new Cuboid(width, height, edge, typeOfPolydron, numberOfSides, length);
        System.out.print("Area of the cuboid: ");
        System.out.println(cub.area());

    }

}
