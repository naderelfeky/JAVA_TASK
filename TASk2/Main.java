package com.company;

import java.security.KeyStore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer nader=new Customer();  //create object of customer

        nader.addServices(300);     //to insert value(200) to Services price
        nader.addProducts(500);     //to insert value(200) to Products price
        nader.setMemberType("Gold");     //to insert type of member
        System.out.println(" Price Of Services "+nader.getTotalServices());
        System.out.println(" Price Of Products "+nader.getTotalProducts());
        System.out.println(" Discount Of Services "+nader.getServicesDiscount());
        System.out.println(" Discount Of Products "+nader.getProductsDiscount());
        System.out.println(" Total Discount "+nader.getTotalDiscount());
        System.out.println(" Price after Discount "+nader.getPrice()); //to print price after discount
    }
}
