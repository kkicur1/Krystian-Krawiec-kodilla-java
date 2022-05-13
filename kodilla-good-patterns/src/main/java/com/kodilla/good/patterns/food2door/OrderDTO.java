package com.kodilla.good.patterns.food2door;

public class OrderDTO {

    private Product product;
    private boolean isOrdered;

    public OrderDTO(Product product, boolean isOrdered) {

        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "product=" + product +
                ", isOrdered=" + isOrdered +
                '}';
    }
}
