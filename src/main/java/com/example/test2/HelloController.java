package com.example.test2;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.sql.*;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;
public class HelloController implements Initializable {

    public TextField oid;
    public TextField oproductname;
    public TextField oproductprize;
    public TextField oorderdate;
    @FXML
    Private Tableview<orders> tableview;
    @FXML
    Private TableColumn<orders,Integer> id;
    @FXML
    Private TableColumn<orders,String> productname;
    @FXML
    private TableColumn<orders,decimal> productprize;
    @FXML
    private TableColumn<orders,date> orderdate;
    Observablelist<orders> list = FXCollection.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourcebundle){
        id.setCellValueFactory(new
                Property value Factory<orders, Integer>)
    }


    public void populateTable() {
        // Establish a database connection
        String jdbcUrl = "jdbc:mysql://localhost:3306/test2login";
        String dbUser = "root";
        String dbPassword = "";
        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                dbPassword)) {
            // Execute a SQL query to retrieve data from the database
            String query = "SELECT * FROM `users`";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
          ;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void onHelloButtonClick(ActionEvent actionEvent) {
    }

    public void updatedata(ActionEvent actionEvent) {
    }

    public TextField getOid() {
        return oid;
    }

    public void setOid(TextField oid) {
        this.oid = oid;
    }

    public TextField getOproductname() {
        return oproductname;
    }

    public void setOproductname(TextField oproductname) {
        this.oproductname = oproductname;
    }

    public TextField getOproductprize() {
        return oproductprize;
    }

    public void setOproductprize(TextField oproductprize) {
        this.oproductprize = oproductprize;
    }

    public TextField getOorderdate() {
        return oorderdate;
    }

    public void setOorderdate(TextField oorderdate) {
        this.oorderdate = oorderdate;
    }
}