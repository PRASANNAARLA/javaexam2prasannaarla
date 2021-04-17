/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author prasanna arla
 */
public class Duplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        String st = sc.nextLine();
        String arrayA[] = st.split(" ", 10);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrayA.length; i++) {
            int m = Integer.parseInt(arrayA[i]);
            list.add(m);
        }
        removeDuplicate(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> distinct = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (distinct.contains(list.get(i))) {

            } else {
                distinct.add(list.get(i));
            }

        }
        System.out.println("The distinct integers are " + distinct.toString().replace("[", "").replace("]", "").replaceAll(",", ""));
    }
}
