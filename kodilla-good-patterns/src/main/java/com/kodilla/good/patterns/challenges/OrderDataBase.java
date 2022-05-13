package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderDataBase implements OrderRepository {

    public void createOrder(User user, Product product, LocalDateTime orderTime) {

        System.out.println("Utworzono zamówienie: "+ user+ product.toString()+ orderTime);
    }
}
