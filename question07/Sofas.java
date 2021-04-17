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
public enum Sofas {
    FUTON(10.0, 13.0, 15.0),
    COUCH(12.0, 16.0, 18.0),
    DIVAN(11.0, 12.0, 14.0);

    private final double length;
    private final double height;
    private final double width;

    private Sofas(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

}
