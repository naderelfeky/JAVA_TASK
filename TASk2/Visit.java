package com.company;

public class Visit {
    private boolean isMember;    //to know if customer is member
    private String memberType;
    private long totalServices;
    private long totalProducts;
    Visit(){       // A no-arg constructor
        isMember=false;
        memberType="null";
    }
    Visit(boolean isMember ,String memberType ){  // constructor
        this.isMember=isMember;
        this.memberType=memberType;
    }

    Visit(boolean isMember ){                     // constructor
        this.isMember=isMember;
        this.memberType="null";
    }

    public void setIsMember(boolean isMember){
        this.isMember=isMember;
        this.memberType="Silver";
    }

    public  boolean getIsMember(){          //to return if customer is member or not
        return isMember;
    }

     public long getTotalProducts(){
        return  totalProducts;
     }
     public void addProducts(long visit){  //to add products price to list
         totalProducts+=visit;
     }
    public long getTotalServices(){
        return  totalServices;
    }
    public void addServices(long visit){  //to add services price to list
        totalServices+=visit;
    }
    public long getTotal(){           //to return total price (services&products)
        return  (totalServices+totalProducts);
    }

    public void setMemberType(String memberType){
        if(memberType.equals("Premium")||memberType.equals("Gold")||memberType.equals("Silver")){
            this.memberType=memberType;
            this.isMember=true;
        }else {
            this.memberType="null";
            System.out.println("this type of member is unavailable");
        }
    }
    public String getMemberType(){   //to return the member type("Gold","Premium","Silver")
        return memberType;
    }

}

