package com.example.scrapmanagmentsystem;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloController {

    Stage stage;
    Scene scene;

    @FXML
    private HBox Container;

    @FXML
    private TextField ageTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private PasswordField signinPasswordTextField;

    @FXML
    private TextField signinUsernameTextField;

    @FXML
    private HBox logo;

    @FXML
    private Label passwordMatchLabel;

    @FXML
    private Button signInSelectionButton;

    @FXML
    private Button signUnButton;

    @FXML
    private PasswordField signUpConfirmPassword;

    @FXML
    private PasswordField signUpPassword;

    @FXML
    private Button signUpSelectionButton;

    @FXML
    private Button signinButton;
    @FXML
    private Button addTransaction;
    @FXML
    private Button searchItems;

    @FXML
    private Button showBalance;

    @FXML
    private HBox signinContainer;

    @FXML
    private Button signin;

    @FXML
    private Button signup;

    public void signinButton(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("landingPage.fxml"));
        stage = (Stage)(((Node)e.getSource()).getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    public void signUpButton(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("landingPage.fxml"));
        stage = (Stage)(((Node)e.getSource()).getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSignUpPage(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup.fxml"));
        stage = (Stage)(((Node)e.getSource()).getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSignInPage(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        stage = (Stage)(((Node)e.getSource()).getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

}
