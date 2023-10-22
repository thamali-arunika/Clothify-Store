package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import model.tm.Item;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ItemController implements Initializable {
    public JFXTextField txtItemCode;
    public JFXComboBox txtSupplierId;
    public JFXComboBox txtSupplierName;
    public JFXTextField txtItemDescription;
    public JFXComboBox txtItemQty;
    public JFXComboBox txtAddQty;
    public JFXTextField txtBuyingPrice;
    public JFXTextField txtSellingPrice;
    public JFXComboBox txtItemType;
    public JFXComboBox txtItemSize;
    public JFXTextField txtItemProfit;
    public JFXButton btnAddStock;
    public TableView tblItem;
    public TableColumn clmItemCode;
    public TableColumn clmDescription;
    public TableColumn clmQty;
    public TableColumn clmSellingPrice;
    public TableColumn clmBuyingPrice;
    public TableColumn clmItemSize;
    public TableColumn clmItemType;
    public TableColumn clmItemProfit;
    public TableColumn clmSupplierId;
    public TableColumn clmItemOption;
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

    public void btnItemPrint(ActionEvent actionEvent) {
    }

    public void btnItemClear(ActionEvent actionEvent) {
    }

    public void btnItemAddStock(ActionEvent actionEvent) {
    }

    public void btnItemSave(ActionEvent actionEvent) {
    }

    public void btnItemSearch(ActionEvent actionEvent) {
    }
private void tblLoad(){
    ObservableList<Item>itemList= FXCollections.observableArrayList();
    List<Item>list=new ArrayList<>();
}
    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        txtAddQty.setDisable(true);
//        txtItemType.setDisable(true);
//        txtItemSize.setDisable(true);
//        btnAddStock.setDisable(true);
//
    }


    public void btnSize(ActionEvent actionEvent) {
    }
}
