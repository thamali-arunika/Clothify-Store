package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SupplierForm {
    private Stage stage;
    private Scene scene;
    private Parent parent;
    public void btnArrowBack(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/dashBoardForm.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
