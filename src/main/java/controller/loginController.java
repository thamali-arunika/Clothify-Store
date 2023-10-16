package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController {
    public JFXTextField txtEmail;
    public JFXTextField txtPassword;

    private Stage stage;
    private Scene scene;
    private Parent parent;


    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
         parent = FXMLLoader.load(getClass().getResource("/view/dashBoardForm.fxml"));
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
        stage.setX(100);
        stage.setY(30);
    }


    public void signInBtn(MouseEvent mouseEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/registationForm.fxml"));
        stage= (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
        stage.setX(300);
        stage.setY(30);
    }
}
