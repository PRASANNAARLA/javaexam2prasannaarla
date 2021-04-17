/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;
//Example01

/**
 *
 * @author prasanna arla
 */
public class SofasDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("The length of the couch is: ");
        System.out.println(Sofas.COUCH.getLength() + "inches");
        for (Sofas sofa : Sofas.values()) {
            System.out.println(sofa + "\n" + "The height is: " + sofa.getHeight() + "\n" + "The length is: " + sofa.getLength() + "\n" + "The width is: " + sofa.getWidth());
        }

    }
}
