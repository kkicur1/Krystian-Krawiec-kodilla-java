package com.kodilla.good.patterns.food2door;

public class Run {

    public static void main (String[] args) {
        ExtraFoodShopProcessor extraFoodShopProcessor= new ExtraFoodShopProcessor();
        OrderDTO order1= extraFoodShopProcessor.process(new Product("Sałata", 2));
        System.out.println( "Zamówienie zrealizowano : "+ order1.isOrdered()+ "\n"+ "Zamówiony produkt: "+ order1.getProduct().getProductName());
        
        GlutenFreeShop glutenFreeShop=new GlutenFreeShop();
        glutenFreeShop.process(new Product("Pomidor", 3));

        HealthyShop healthyShop= new HealthyShop();
        OrderDTO order2= healthyShop.process(new Product("Ogórek",5));
        System.out.println( "Zamówienie zrealizowano : "+ order2.isOrdered()+ "\n"+ "Zamówiony produkt: "+ order2.getProduct().getProductName());


    }
}
