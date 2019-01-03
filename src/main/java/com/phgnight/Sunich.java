package com.phgnight;

public class Sunich extends DrinkDecorator{
    public Sunich(Drink drink){
        super(drink);
    }


    public int getPrice(){return super.getPrice() + 5000;}
    public String getDescription(){return super.getDescription() + ", " + "Sunich";}



}
