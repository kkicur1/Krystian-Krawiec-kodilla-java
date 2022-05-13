package com.kodilla.good.patterns.food2door;

public class HealthyShop implements OrderProcessor {

    private static final String NAME= "Healthy Shop";
    private static boolean regularDiscount=true;

    @Override
    public OrderDTO process(Product product) {
        System.out.println("Procesuje zamówienie dla: "+ NAME);
        if(regularDiscount==true) {
            System.out.println("Dodaje zniżke za regularne zamówienia");
        }
        System.out.println("Zamówiona ilość: "+ product.getQuantity());
        return new OrderDTO(product,true);

    }
}

