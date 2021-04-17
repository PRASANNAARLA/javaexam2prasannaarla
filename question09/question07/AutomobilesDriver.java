/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;
//Example02

/**
 *
 * @author prasanna arla
 */
public class AutomobilesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("the number of miles: " + Automobiles.CARS.getMiles());
        System.out.println("the time taken to travel: " + Automobiles.MOTORCYCLE.getTimeTakenToTravel());

        for (Automobiles auto : Automobiles.values()) {
            System.out.println(auto + "The speed of the automobiles is: " + auto.getSpeed() + "miles/hour");
        }

    }

}
