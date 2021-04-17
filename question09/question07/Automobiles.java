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
public enum Automobiles {
    CARS(1000.0, 20),
    MOTORCYCLE(800.0, 10),
    JEEP(500.0, 15);
    private final double miles;
    private final int timeTakenToTravel;

    private Automobiles(double miles, int timeTakenToTravel) {
        this.miles = miles;
        this.timeTakenToTravel = timeTakenToTravel;
    }

    public double getMiles() {
        return miles;
    }

    public int getTimeTakenToTravel() {
        return timeTakenToTravel;
    }

    public double getSpeed() {
        double speed = 0.0;
        speed = miles / timeTakenToTravel;
        return speed;
    }

}
