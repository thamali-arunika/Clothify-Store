package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashBoardForm {
    public AnchorPane root;
    private Stage stage;
    private Scene scene;
    private Parent parent;

    public void btnItem(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/itemForm.fxml");

        assert resource != null;

        Parent load = (Parent) FXMLLoader.load(resource);
        this.root.getChildren().clear();
        this.root.getChildren().add(load);

    }

    public void btnOrders(ActionEvent actionEvent) {
    }

    public void btnEmployers(ActionEvent actionEvent) {
    }

    public void btnSuppliers(ActionEvent actionEvent) {
    }

    public void btnOrderDetails(ActionEvent actionEvent) {
    }

    public void btnSalesReturn(ActionEvent actionEvent) {
    }

    public void btnSalesReport(ActionEvent actionEvent) {
    }
}
