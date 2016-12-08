package com.gordolio.controls.sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane mainPane = new MainPane();
        stage.setScene(new Scene(mainPane));
        stage.setTitle("Gordolio jFX Controls");
        stage.setResizable(false);
        stage.setWidth(300);
        stage.setHeight(400);
        stage.show();
    }
}
