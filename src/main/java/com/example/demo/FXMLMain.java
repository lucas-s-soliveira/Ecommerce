package com.example.demo;

import com.example.demo.model.Product;
import com.example.demo.model.Stock;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class FXMLMain extends Application {


    @Override
    public void start (Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLMain.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        List<Product>  products= new ArrayList<>();
        Product product1 = new Product("Pencil", 1.00, 100);
        Product product2 = new Product("Book", 5.00, 10);
        Product product3 = new Product("Notebook", 10.00, 50);
        Stock stock = new Stock();
        stock.addProduct(product1);
        stock.addProduct(product2);
        stock.addProduct(product3);



        launch(args);
    }
}
