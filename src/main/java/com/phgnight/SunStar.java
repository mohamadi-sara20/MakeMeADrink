package com.phgnight;

public class SunStar extends DrinkDecorator{
    public SunStar(Drink drink){
        super(drink);
    }

    public int getPrice(){return super.getPrice() + 3000;}
    public String getDescription(){return super.getDescription() + ", " + "SunStar";}

}
