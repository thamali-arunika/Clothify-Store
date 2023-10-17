package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardForm implements Initializable {
    public AnchorPane root;
    private Stage stage;
    private Scene scene;
    private Parent parent;

    public void btnHome(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/homeForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);
        stage.setY(0);
        stage.setX(10);

    }

    public void btnItem(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/itemForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);
        stage.setY(0);
        stage.setX(10);
    }

    public void btnOrders(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/orderForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);
        stage.setY(0);
        stage.setX(10);
    }

    public void btnEmployers(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/employerForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);
        stage.setY(0);
        stage.setX(10);
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
        stage.setY(0);
        stage.setX(10);
    }

    public void btnSalesReturn(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/salesReturnForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);
        stage.setY(0);
        stage.setX(10);
    }

    public void btnSalesReport(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/salesReportForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);
        stage.setY(0);
        stage.setX(10);
    }
    public void btnArrowBack(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/loginForm.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
        stage.setX(100);
        stage.setY(30);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        URL resource = this.getClass().getResource("/view/homeForm.fxml");

        assert resource != null;

        Parent load = null;
        try {
            load = (Parent) FXMLLoader.load(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.root.getChildren().clear();
        this.root.getChildren().add(load);

    }



}
