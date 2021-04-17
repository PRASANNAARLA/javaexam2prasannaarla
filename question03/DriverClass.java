/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author prasanna arla
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> loans = new ArrayList<>();
        Date da = new Date();
        Circle ci = new Circle(12.0, 15.0);
        Loan lo = new Loan("Prasanna", 15.0, 23.0);
        String name = "prasanna";
        loans.add(lo);
        loans.add(ci);
        loans.add(da);
        loans.add(name);
        for (Object o : loans) {
            System.out.println(o.toString().replace("[", "").replace("]", ""));
        }
    }

}
