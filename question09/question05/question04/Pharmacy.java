/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04;

/**
 *
 * @author prasanna arla
 */
public class Pharmacy extends Store {

    private String disease;

    public Pharmacy(String disease, int sellerId, String customerName, int noOfItems, double Cost) {
        super(sellerId, customerName, noOfItems, Cost);
        this.disease = disease;
    }

    public String getNameOfMedicine() {
        return disease;
    }

    public void setNameOfMedicine(String namOfMedicine) {
        this.disease = disease;
    }

    public String medicine() {
        String nameOfMedicine = " ";
        if (disease.equals("cold and cough")) {
            nameOfMedicine = "citrizen";
        }
        if (disease.equals("fever")) {
            nameOfMedicine = "paracetemol";
        }
        if (disease.equals("no fever")) {
            nameOfMedicine = "no medicine";
        }
        return nameOfMedicine;
    }

    @Override
    public String toString() {
        return super.toString() + "\nmedicine: " + medicine();
    }

}
