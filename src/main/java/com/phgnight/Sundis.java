package com.phgnight;

public class Sundis extends DrinkDecorator{

    public Sundis(Drink drink){
        super(drink);
    }

    public int getPrice(){return super.getPrice() + 500;}
    public String getDescription(){return super.getDescription() + ", " + "Sundis";}

}
