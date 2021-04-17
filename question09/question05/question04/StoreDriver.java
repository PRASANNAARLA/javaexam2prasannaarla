/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04;

import java.util.Scanner;

/**
 *
 * @author prasanna arla
 */
public class StoreDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the seller id: ");
        int sellerId = scan.nextInt();
        System.out.print("Enter customer name: ");
        String customerName = scan.next();
        System.out.print("Enter no of items: ");
        int noOfItems = scan.nextInt();
        System.out.print("Enter cost of item: ");
        double Cost = scan.nextDouble();
        System.out.print("Enter the cost price: ");
        double costPrice = scan.nextDouble();
        System.out.print("Enter the selling price: ");
        double sellingPrice = scan.nextDouble();
        Store store = new Store(sellerId, customerName, noOfItems, Cost);

        System.out.println(store.toString());
        System.out.print("Enter the disease: ");
        String disease = scan.next();
        Pharmacy more = new Pharmacy(disease, sellerId, customerName, noOfItems, Cost);

        System.out.println(more.toString());

        General gen = new General(costPrice, sellingPrice, sellerId, customerName, noOfItems, Cost);
        System.out.print("Money received by seller is: ");
        System.out.println(gen.MoneyReceivedBySeller());

    }

}
