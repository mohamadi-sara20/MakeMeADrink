package com.phgnight;

public class Lemon implements Drink {
    private int price;
    public Lemon(int price){
        this.price = price;
    }

    public int getPrice(){return  this.price;}
    public String getDescription(){return "Lemon Juice";}

}
