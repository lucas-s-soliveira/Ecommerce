package com.example.demo.model;

public class ShoppingCartItem {

    private Product product;
    private int quant;

    public ShoppingCartItem() {
        this.product = product;
    }

    public ShoppingCartItem(Product product, int quant) {
        this.product = product;
        this.quant = quant;
    }

    public double Subtotal() {
        return product.getPrice() * quant;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @return the quant
     */
    public int getQuant() {
        return quant;
    }

    public void remove(String productName) {
        // TODO Auto-generated method stub

    }

}

