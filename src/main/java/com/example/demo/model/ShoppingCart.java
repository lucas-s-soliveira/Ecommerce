package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<ShoppingCartItem> itens;
    private Stock stock;

    public ShoppingCart() {

    }
    public ShoppingCart(Stock stock) {
        this.itens = new ArrayList<>();
        this.stock = stock;
    }

    public void addItem(String productName, int quant) {
        Product product = stock.seachProduct(productName);

        if (product != null) {
            addItem(productName, quant);
        } else {
            System.out.println("Product not found in stock");
        }
    }

    public void removeItem(String productName) {
        ShoppingCartItem removeItem = null;
        for (ShoppingCartItem item : itens) {
            if (item.getProduct().getName().equalsIgnoreCase(productName)) {
                removeItem = item;
                break;
            }
        }

        if (removeItem != null) {
            removeItem.remove(productName);
            stock.addProduct(removeItem.getProduct());
            System.out.println("Item removed " + productName);
        } else {
            System.out.println("Item not found");
        }
    }
}
