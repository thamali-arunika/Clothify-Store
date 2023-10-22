package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SupplierForm implements Initializable {
    public JFXTextField txtSupplierId;
    public JFXTextField txtSupName;
    public TableView tblSupplier;
    public TableColumn clmSupId;
    public TableColumn clmSupTitle;
    public TableColumn clmSupName;
    public TableColumn clmSupUnitPrice;
    public TableColumn clmSupOption;
    public JFXTextField txtSupTitle;
    public JFXTextField txtSupContact;
    public JFXTextField txtSupCompany;
    public TableColumn clmSupContact;
    public TableColumn clmSupCompany;
    public JFXTextField txtSupEmail;
    public TableColumn clmItemCode;
    public TableColumn clmDescription;
    public TableColumn clmQty;
    private Stage stage;
    private Scene scene;
    private Parent parent;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
clmSupId.setCellValueFactory(new PropertyValueFactory<>("supplierId"));
        clmSupTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        clmSupName.setCellValueFactory(new PropertyValueFactory<>("supplierName"));
        clmSupContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        clmSupCompany.setCellValueFactory(new PropertyValueFactory<>("company"));
        clmSupOption.setCellValueFactory(new PropertyValueFactory<>("option"));
clmItemCode.setCellValueFactory(new PropertyValueFactory<>("itemCode"));
 clmDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
 clmQty.setCellValueFactory(new PropertyValueFactory<>("qtyOnHand"));
    }
    public void btnArrowBack(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/dashBoardForm.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }


}
