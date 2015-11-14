package com.diamantinastudio.syscons;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
            Scene scene = new Scene(root);
            
            //stage.getIcons().add(new Image(Main.class.getResourceAsStream("/img/ico.png")));
            stage.setTitle("Cadastro de clientes");
            stage.sizeToScene();
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.getMessage();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }   
}
