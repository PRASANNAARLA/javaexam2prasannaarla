/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_example02;
//Example02

/**
 *
 * @author prasanna arla
 */
public class Cuboid extends Polyhedron {

    private double width;
    private double height;

    public Cuboid(double width, double height, double edge, String typeOfPolydron, int numberOfSides, double length) {
        super(edge, typeOfPolydron, numberOfSides, length);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {

        double area = 2 * height * (super.getLength() + width);

        return area;
    }

}
