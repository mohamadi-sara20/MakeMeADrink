package com.phgnight;

public class PickName extends DrinkDecorator {
    public PickName(Drink drink){
        super(drink);
    }


    public double getPrice(){return super.getPrice() + 8000;}
    public String getDescription(){return super.getDescription() +  ", Natural Nectar";}
}
