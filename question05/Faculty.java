/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author S542294
 */
public class Faculty extends Employee {

    private String officeHours;
    private int numberOfTeachingSubjects;

    public Faculty(String officeHours, int numberOfTeachingSubjects, String office, double salary, String dateHired,
            String name, String address, String phoneNumber, String email) {
        super(office, salary, dateHired, name, address, phoneNumber, email);
        this.officeHours = officeHours;
        this.numberOfTeachingSubjects = numberOfTeachingSubjects;
    }

    @Override
    public String toString() {
        return "ClassName = Faculty, " + super.toString() + ",\nofficeHours="
                + officeHours + ", "
                + "numberOfTeachingSubjects=" + numberOfTeachingSubjects;
    }
}
