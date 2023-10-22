package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import crudUtil.CrudUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.tm.Employer;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class EmployerForm implements Initializable {
    public JFXTextField txtEmployerId;
    public JFXTextField txtEmpDob;
    public JFXTextField txtEmpContact;
    public JFXTextField txtEmpNic;
    public TableView tblEmployer;
    public TableColumn clmId;
    public TableColumn clmTitle;
    public TableColumn clmEmpName;
    public TableColumn clmEmpDob;
    public TableColumn clmEmpAddress;
    public TableColumn clmEmpContact;
    public TableColumn clmEmpBkAccount;
    public TableColumn clmEmpBankBranch;
    public TableColumn clmEmpNic;
    public JFXTextField txtEmpName;
    public JFXTextField txtEmpAddress;
    public JFXTextField txtEmpBankBranch;
    public JFXTextField txtEmpBankAccount;
    public JFXComboBox cmbTitle;
    private Stage stage;
    private Scene scene;
    private Parent parent;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    clmId.setCellValueFactory(new PropertyValueFactory<>("empId"));
    clmTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        clmEmpName.setCellValueFactory(new PropertyValueFactory<>("name"));
        clmEmpNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        clmEmpDob.setCellValueFactory(new PropertyValueFactory<>("dob"));
        clmEmpAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        clmEmpBkAccount.setCellValueFactory(new PropertyValueFactory<>("bankAccNo"));
        clmEmpBankBranch.setCellValueFactory(new PropertyValueFactory<>("bankBranch"));
       clmEmpContact.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
       cmbTitle.getItems().addAll("Mrs","Mr","Ms");
//       tblLoad();
    }
//    public void tblLoad(){
//        ObservableList<Employer>empList= FXCollections.observableArrayList();
//        try {
//            ResultSet rst = CrudUtil.execute("SELECT * FROM Employer");
//            while (rst.next()){
//                empList.add(new Employer(
//                        rst.getInt(1),
//                        rst.getString(2),
//                        rst.getString(3),
//                        rst.getString(4),
//                        rst.getString(5),
//                        rst.getString(6),
//                        rst.getString(7),
//                        rst.getString(8),
//                        rst.getString(9)
//                ));
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
    public void btnArrowBack(ActionEvent actionEvent) throws IOException {
        parent= FXMLLoader.load(getClass().getResource("/view/dashBoardForm.fxml"));
        stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public void btnEmpPrint(ActionEvent actionEvent) {
    }

    public void btnEpClear(ActionEvent actionEvent) {
    }

    public void btnEmpSave(ActionEvent actionEvent) {

        Boolean isAdd = null;
        try {
            isAdd = CrudUtil.execute("INSERT INTO Employer(title,name,nic,dob,address,contact,bankAccount,bankBranch)\n" + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)",
                    cmbTitle.getSelectionModel().getSelectedItem().toString(),
                    txtEmpName.getText(),
                    txtEmpNic.getText(),
                    txtEmpDob.getText(),
                    txtEmpAddress.getText(),
                    txtEmpBankAccount.getText(),
                    txtEmpBankBranch.getText(),
                    txtEmpContact.getText());
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        if(isAdd){
            new Alert(Alert.AlertType.INFORMATION,"Added Success !").show();
        }else {
            new Alert(Alert.AlertType.ERROR,"Added Field !").show();
        }
    }

    public void btnEmpSearch(ActionEvent actionEvent) {
    }


}
