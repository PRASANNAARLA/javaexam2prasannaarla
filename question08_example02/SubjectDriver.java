/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08_example02;

import java.util.Scanner;

/**
 *
 * @author prasanna arla
 */
public class SubjectDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter subject code :");
        int code = scan.nextInt();
        System.out.println("Enter if is prequisite required or not enter true or false :");
        boolean required = scan.nextBoolean();
        System.out.println("Enter marks in maths :");
        int mark = scan.nextInt();
        System.out.println("Enter total Chapters :");
        int chap = scan.nextInt();
        System.out.println("Enter the science marks :");
        int scim = scan.nextInt();
        System.out.println("Enter the lab marks :");
        int lab = scan.nextInt();
        Maths mth = new Maths(mark, chap, code, required);
        Science sci = new Science(scim, lab, code, required);
        System.out.println(mth.toString());
        System.out.println(sci.toString());

    }

}
