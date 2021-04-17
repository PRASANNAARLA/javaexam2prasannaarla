/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_example03;

/**
 *
 * @author prasannna arla
 */
public class Flowers extends Garden {

    private int flowerVariaties;

    public Flowers(int flowerVariaties, int gardenArea, String gardenSoil) {
        super(gardenArea, gardenSoil);
        this.flowerVariaties = flowerVariaties;
    }

    public int getFlowerVariaties() {
        return flowerVariaties;
    }

    public void setFlowerVariaties(int flowerVariaties) {
        this.flowerVariaties = flowerVariaties;
    }

    @Override
    public String toString() {
        return super.toString() + "Flowers{" + "flowerVariaties=" + flowerVariaties + '}';
    }

}
