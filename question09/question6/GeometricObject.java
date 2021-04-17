/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author prasanna arla
 */
public abstract class GeometricObject {

    public String color;
    public boolean isFilled;

    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nisFilled: " + isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
