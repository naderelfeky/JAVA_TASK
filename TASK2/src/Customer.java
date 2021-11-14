package com.company;

public class Customer extends Discount{
private double price;

    public double getPrice() {     //method that return the value of shopping after discount
        price=(getTotal()-getServicesDiscount()-getProductsDiscount());
        return price;
    }
}
