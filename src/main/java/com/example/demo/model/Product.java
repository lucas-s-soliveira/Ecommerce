package com.example.demo.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {
    void test() {}

    private  UUID id;
    private String name;
    private Double price;
    private int quant;

    public Product(String name, double price, int quant) {
        this.name = name;
        this.price = price;
        this.quant = quant;
        id = UUID.randomUUID();

    }

    /**
     * @return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the quant
     */
    public int getQuant() {
        return quant;
    }

    /**
     * @param quant the quant to set
     */
    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quant=" + quant +"] \n";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
