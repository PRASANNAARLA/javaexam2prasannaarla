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
public class Employee extends Person {

    private String office;
    private double salary;
    private String dateHired;

    public Employee(String office, double salary, String dateHired, String name,
            String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "ClassName = Employee, " + super.toString() + ",\noffice=" + office
                + ", salary=" + salary
                + ", dateHired=" + dateHired;
    }

}
