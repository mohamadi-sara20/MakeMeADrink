package com.phgnight;

public class Lemon implements Drink {
    private double price;
    public Lemon(double price){
        this.price = price;
    }

    public double getPrice(){return  this.price;}
    public String getDescription(){return "Lemon juice";}

}
