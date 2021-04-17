/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_example03;

/**
 *
 * @author prasanna arla
 */
public class Fruits extends Garden {

    private String typeOfFruit;

    public Fruits(String typeOfFruit, int gardenArea, String gardenSoil) {
        super(gardenArea, gardenSoil);
        this.typeOfFruit = typeOfFruit;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public void setTypeOfFruit(String typeOfFruit) {
        this.typeOfFruit = typeOfFruit;
    }

    @Override
    public String toString() {
        return super.toString() + "Fruits{" + "typeOfFruit=" + typeOfFruit + '}';
    }

}
