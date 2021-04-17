/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

/**
 *
 * @author prasanna arla
 */
public class Fans implements CeilingFan, TableFan {

    public String brand;
    public int numberOfWings;

    public Fans(String brand, int numberOfWings) {
        this.brand = brand;
        this.numberOfWings = numberOfWings;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    public int CellingRotations() {
        int rotate = 10;
        int hour = 1;
        int perhourrotate = rotate * hour;
        return perhourrotate;
    }

    public int tableRotations() {
        int rotate = 20;
        int hour = 1;
        int perhourrotate = rotate * hour;
        return perhourrotate;

    }

    @Override
    public String toString() {
        return "Fans{" + "brand=" + brand + ", numberOfWings=" + numberOfWings + ", numberofrotations for celing fan=" + CellingRotations() + ", numberofrotations for table fan=" + tableRotations() + '}';
    }

}
