/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author prasanna arla
 */
public class Circle {

    private double diameter;
    private double perimeter;

    public Circle(double diameter, double perimeter) {
        this.diameter = diameter;
        this.perimeter = perimeter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        double area = Math.PI * (Math.pow(diameter, 2) / 4);
        return area;
    }

    @Override
    public String toString() {
        return "diameter=" + diameter + ", perimeter=" + perimeter + ", area=" + getArea();
    }

}
