package com.company;

public class MyPoint {
    private  int yCoordinate;
    private  int xCoordinate;

    MyPoint(){
        this.xCoordinate=0;
        this.yCoordinate=0;
    }
    MyPoint(int xCoordinate,int yCoordinate){
        this.yCoordinate=yCoordinate;
        this.xCoordinate=xCoordinate;
    }
    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }
    //A method named distance that returns the distance from this point to another
    //point of the MyPoint type
    public double distance(MyPoint  myPoint){
        int x=this.xCoordinate-myPoint.getXCoordinate();
        int y=this.yCoordinate-myPoint.getYCoordinate();
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
      //A method named distance that returns the distance from this point to another
      //point with specified x- and y-coordinates.
    public double distance(int xCoordinate,int yCoordinate){
        int x=this.xCoordinate-xCoordinate;
        int y=this.yCoordinate-yCoordinate;
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public static void main(String[] args) {
	// write your code here
        MyPoint point1= new MyPoint(0,0);
        MyPoint point2= new MyPoint(4,3);
        System.out.println(point1.getYCoordinate() +" "+ point1.getXCoordinate());
        System.out.println(point1.distance(point2));
        System.out.println(point1.distance(1,2));

    }
}
