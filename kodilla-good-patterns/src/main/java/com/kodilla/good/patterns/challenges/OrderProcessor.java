package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderProcessor implements OrderService {

    @Override
    public boolean order(User user, Product product, LocalDateTime orderTime) {
        System.out.println("zamówienie  produktu: "+product+" /zrealizowano dla: "+user+" /z datą: "+orderTime);
        return true;
    }
}
