package com.damianosiak.orclmonitorx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;

public class ORCLmonitorX extends Application {
    //Zmienne globalne
    Stage stageWidth = null;
    //Connections
    String defaultPathToFile = System.getenv("APPDATA").replace("\\","\\\\")+"\\\\ORCLmonitorX\\\\.json";
    String currentPathToFile = defaultPathToFile.replace("\\\\","\\");
    Boolean fileIsChanged=false;
    String backgroundColor = "#efeeef";
    //koniec - zmienne globalne


    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("ORCLmonitorX | "+currentPathToFile);
        stageWidth = primaryStage;
        Group root = new Group();
        Scene scene = new Scene(root, 1600, 900, Paint.valueOf(backgroundColor));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}