package print_a4;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class SelectController implements Initializable {

   
           
    @FXML
    private AnchorPane root;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXTextField txtItemNameAra;

    @FXML
    private JFXTextField txtItemDesAra;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtDes;

    @FXML
    private JFXTextField txtOldPrice;

       @FXML
    private JFXTextField txtOldPoint;
       
         @FXML
    private JFXTextField txtnewPrice;

    @FXML
    private JFXTextField txtnewPricePoint;

    
    public String color = "";
    
     @FXML
    private JFXCheckBox cbxWhite;

    @FXML
    private JFXCheckBox cbxYellow;
    
     @FXML
    void cbxWhiteAction(ActionEvent event) {
        if(cbxWhite.isSelected()){
            color = "white";
            cbxYellow.setSelected(false);
        }else{
            color = "";
        }
    }

    @FXML
    void cbxYellowAction(ActionEvent event) {
        if(cbxYellow.isSelected()){
            color = "yellow";
            cbxWhite.setSelected(false);          
        }else{
            color = "";
        }
    }
            
            
    @FXML
    void btnSaveAction(ActionEvent event) {
        try {
            MainController.itemNameArab = txtItemNameAra.getText().trim();
            MainController.itemDesArab = txtItemDesAra.getText().trim();
            MainController.itemName = txtName.getText().trim();
            MainController.itemDes = txtDes.getText().trim();
            MainController.oldPrice = txtOldPrice.getText().trim();
            MainController.oldPricePoint = txtOldPoint.getText().trim();
            MainController.newPrice = txtnewPrice.getText().trim();
            MainController.newPricePoint = txtnewPricePoint.getText().trim();
            MainController.color = color;
            
            
            Parent p = FXMLLoader.load(getClass().getResource("Main.fxml"));
            root.getChildren().setAll(p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

       // root.setStyle("-fx-background-color: #DD5246");
    }

}
