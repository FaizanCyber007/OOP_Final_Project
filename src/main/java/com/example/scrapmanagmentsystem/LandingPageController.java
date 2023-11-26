package com.example.scrapmanagmentsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class LandingPageController {
    Stage stage;
    Scene scene;

    @FXML
    private HBox Container;

    @FXML
    private Label addTransactionOptionsInstruction;

    @FXML
    private Button backButton;

    @FXML
    private Button iBoughtButton;

    @FXML
    private Button iSoldButton;

    @FXML
    private VBox logo;

    @FXML
    private Button addTransactionButton;

    @FXML
    private Label addTransactionInstructionLabel;

    @FXML
    private TextField productIDTextField;

    @FXML
    private TextField productNameTextField;

    @FXML
    private Button searchButton;

    @FXML
    private Label searchItemInstructionLabel;

    @FXML
    private TextField transactionContactField;

    @FXML
    private DatePicker transactionDatePicker;

    @FXML
    private TextField transactionItemNameField1;

    @FXML
    private TextField transactionItemRateField;

    @FXML
    private TextField transactionItemWeightField;

    @FXML
    private TextField transactionPersonNameField;


    public void showBalance(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("balance.fxml"));
        stage = (Stage)(((Node)e.getSource()).getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "This information is sensitive. Do you want to continue?", ButtonType.YES,ButtonType.NO);
        alert.showAndWait();
        if(alert.getResult() == ButtonType.YES) {
            stage.setScene(scene);
            stage.show();
        }
        else {
            alert.close();
        }
    }
    public void searchItem(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("searchItems.fxml"));
        stage = (Stage)(((Node)e.getSource()).getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    public void goBackToLandingPage(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("landingPage.fxml"));
        stage = (Stage)(((Node)e.getSource()).getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    public void addNewTransactionOptions(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addTransactionOptions.fxml"));
        stage = (Stage)(((Node)e.getSource()).getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    public void addNewTransaction(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addTransaction.fxml"));
        stage = (Stage)(((Node)e.getSource()).getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    public void moveToTransactionOption(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addTransactionOptions.fxml"));
        stage = (Stage)(((Node)e.getSource()).getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}