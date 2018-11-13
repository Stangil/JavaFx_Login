package sample.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DetailsController {

    @FXML
    private Label detailsWelcomeLabel;

    @FXML
    private Label detailsName;

    @FXML
    private Label detailsAge;

    @FXML
    private Label detailsProfession;

    @FXML
    private Hyperlink detailsWeb;

    @FXML
    private Hyperlink detailsEmail;

    @FXML
    void initialize() {
     detailsWeb.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent event) {
             System.out.println(detailsWeb);
             if (Desktop.isDesktopSupported()){
                 try {
                     Desktop.getDesktop().browse(new URI("http://www.google.com"));//Have to inject proper web site
                 } catch (IOException e) {
                     e.printStackTrace();
                 } catch (URISyntaxException e) {
                     e.printStackTrace();
                 }
             }
         }
     });
     detailsEmail.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent event) {
             System.out.println(detailsEmail);
             if (Desktop.isDesktopSupported()){
                 try {
                     Desktop.getDesktop().browse(new URI("http://www.google.com"));//Have to make this work with email
                 } catch (IOException e) {
                     e.printStackTrace();
                 } catch (URISyntaxException e) {
                     e.printStackTrace();
                 }
             }

         }
     });
    }

    void setName(String name, String profession, int age){
        detailsWelcomeLabel.setText("Welcome " + name);
        detailsName.setText("Name: " + name);
        detailsAge.setText("Age: " + age);
        detailsProfession.setText("Profession: " + profession);

    }
}

