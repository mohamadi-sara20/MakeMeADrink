package com.phgnight;

public class Test {
    public static void main( String[] args )
    {

        Drink drink = new ExtraPulp(new Sundis(new FruitNectar(new Lemon(10))));
        System.out.println(drink.getPrice());


    }
}
