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
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ans: prasanna arla");
        Person p1 = new Person("prasanna arla", "Hyderabad", "8106306304",
                "prasannareddyarla@gmail.com");
        System.out.println("\n" + p1);

        Student stud = new Student(3.1, "pranathi arla", "nalgonda", "9505067345",
                "pranathireddyarla@gmail.com");
        System.out.println("\n" + stud);
        Employee empl = new Employee("Google", 30000, "12/10/2019",
                "sridevi arla",
                "mumbai", "9849970826", "srideviarla@gmail.com");
        System.out.println("\n" + empl);

        Staff staf = new Staff("Associative Professor", "Ramu",
                70000, "04/20/2018",
                "radha", "Hyderabad", "9899407628",
                "radhaarla@gmail.com");
        System.out.println("\n" + staf);

        Faculty fa = new Faculty("8:00AM - 4:30 PM", 8,
                "TechM Traning Instituiton", 30000, "06/18/2015",
                "harinath arla", "Ranchi", "9666444164", "harinatharla@gmail.com");
        System.out.println("\n" + fa);

    }

}
