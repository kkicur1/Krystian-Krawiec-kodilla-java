package com.kodilla.good.patterns.food2door;

public class ExtraFoodShopProcessor implements  OrderProcessor {

    private static final String NAME = "Extra Food Shop";

    @Override
    public OrderDTO process( Product product) {
        System.out.println("Procesuje zamowienie dla " + NAME);
        return new OrderDTO(product, true);

    }
}
