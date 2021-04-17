/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author prasanna arla
 */
public class Staff extends Employee {

    private String title;

    public Staff(String title, String office, double salary, String dateHired,
            String name, String address, String phoneNumber, String email) {
        super(office, salary, dateHired, name, address, phoneNumber, email);
        this.title = title;
    }

    @Override
    public String toString() {
        return "ClassName = Staff, " + super.toString() + ",title=" + title;
    }

}
