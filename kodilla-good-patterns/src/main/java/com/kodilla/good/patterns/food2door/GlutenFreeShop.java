package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements OrderProcessor {

    private static final String NAME = "GlutenFreeShop";
    boolean isOrdered=false;


    @Override
    public OrderDTO process(Product product) {
        System.out.println("Procesuje zamówienie dla: " + NAME);
        OrderDTO order2 = new OrderDTO(product, true);
        System.out.println( "Zamówienie zrealizowano : "+ order2.isOrdered()+ "\n"+ "Zamówiony produkt: "+ order2.getProduct().getProductName());
        return order2;
    }
}
