package com.company;

public class Discount extends Visit {
    private double productsDiscount;         //the price of products before discount
    private double  servicesDiscount;        //the price of services before discount


    public double getProductsDiscount(){        //method return Products Discount
        if(getIsMember()){
            productsDiscount=getTotalProducts();
            if(getMemberType().equals("Premium")){
                return ((productsDiscount*20.0)/100);
            }else if(getMemberType().equals("Gold")){
                return ((productsDiscount*15.0)/100);
            }else if(getMemberType().equals("Silver")){
                return ((productsDiscount*10.0)/100);
            }

        }
            return 0.0;
    }


    public double getServicesDiscount(){ //method return Services Discount
        if(getIsMember()){
            servicesDiscount=getTotalServices();
            if(getMemberType().equals("Premium")||getMemberType().equals("Gold")||getMemberType().equals("Silver")){
                return ((servicesDiscount*10.0)/100);
            }

        }
        return 0.0;

    }
    public double getTotalDiscount(){    //method return Total Discount
        return (getProductsDiscount()+getServicesDiscount());
    }
}
