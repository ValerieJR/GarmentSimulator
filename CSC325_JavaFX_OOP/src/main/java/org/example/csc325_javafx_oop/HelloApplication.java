package org.example.csc325_javafx_oop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("CSC325_stylesheet.css").toExternalForm());
        stage.setTitle("FSC CSC325_Full Stack Project");
        stage.setScene(scene);
        stage.show();



    }
}
