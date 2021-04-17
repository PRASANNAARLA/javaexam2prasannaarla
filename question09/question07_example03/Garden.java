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
public class Garden {

    private int gardenArea;
    private String gardenSoil;

    public Garden(int gardenArea, String gardenSoil) {
        this.gardenArea = gardenArea;
        this.gardenSoil = gardenSoil;
    }

    public int getGardenArea() {
        return gardenArea;
    }

    public void setGardenArea(int gardenArea) {
        this.gardenArea = gardenArea;
    }

    public String getGardenSoil() {
        return gardenSoil;
    }

    public void setGardenSoil(String gardenSoil) {
        this.gardenSoil = gardenSoil;
    }

    @Override
    public String toString() {
        return "Garden{" + "gardenArea=" + gardenArea + "sqt" + ", gardenSoil=" + gardenSoil + '}';
    }

}
