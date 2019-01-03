package com.phgnight;

public class Orange implements Drink{
    private double price;
    public Orange(double price){
        this.price = price;
    }

    public double getPrice(){return this.price;}
    public String getDescription(){return "Orange juice";}

}
