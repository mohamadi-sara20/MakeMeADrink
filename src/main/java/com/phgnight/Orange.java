package com.phgnight;

public class Orange implements Drink{
    private int price;
    public Orange(int price){
        this.price = price;
    }

    public int getPrice(){return this.price;}
    public String getDescription(){return "Orange Juice";}

}
