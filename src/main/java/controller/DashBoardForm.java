package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardForm implements Initializable {
    public AnchorPane root;


    public void btnItem(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/itemForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);

    }

    public void btnOrders(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/orderForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);
    }

    public void btnEmployers(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/employerForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);
    }

    public void btnSuppliers(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/supplierForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);
    }

    public void btnOrderDetails(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/orderDetails.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);
    }

    public void btnSalesReturn(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/salesReturnForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);
    }

    public void btnSalesReport(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/salesReportForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
