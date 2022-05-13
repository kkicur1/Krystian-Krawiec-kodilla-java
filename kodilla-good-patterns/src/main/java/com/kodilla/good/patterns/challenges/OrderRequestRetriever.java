package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Krystian", "Krawiec");
        Product product = new Product("TV", 100);
        LocalDateTime orderTime = LocalDateTime.of(2022, 05, 06, 14, 23);

        return new OrderRequest(user,product,orderTime);
    }

}
