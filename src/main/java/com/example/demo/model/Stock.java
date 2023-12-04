package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Product> products;

    public Stock() {

        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);

    }

    public Product seachProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }

        return null;
    }

    public boolean productAvalible(String name, int quant) {
        Product product = seachProduct(name);
        return product != null && product.getQuant() >= quant;
    }

    public void removeProduct(String name, int quant) {
        Product product = seachProduct(name);
        if (product != null && product.getQuant() >= quant) {

            product.setQuant((product.getQuant() - quant));

        } else {
            System.out.println("Produto indisponível no estoque.");
        }
    }
    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("Stock is empty.");
        } else {
            System.out.println("Products in stock:");
            for (Product product : products) {
                System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Quantity: " + product.getQuant() + ", Value: " + product.getPrice());
            }
        }
    }

}
