package com.kodilla.good.patterns.challenges;

public class Product {

    private String productName;
    private int productStock;

    public Product(String productName, int productStock) {
        this.productName = productName;
        this.productStock = productStock;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductStock() {
        return productStock;
    }

    public void decreaseStock() {
        productStock--;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productStock=" + productStock +
                '}';
    }
}
