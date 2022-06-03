
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

public class Select_FifthController implements Initializable {

       
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

    @FXML
    private JFXCheckBox cbxWhite;

    @FXML
    private JFXCheckBox cbxYellow;
    
     public String color = "";
     
     

    @FXML
    void btnSaveAction(ActionEvent event) {
          try {
            Print00000Controller.itemNameArab = txtItemNameAra.getText().trim();
            Print00000Controller.itemDesArab = txtItemDesAra.getText().trim();
            Print00000Controller.itemName = txtName.getText().trim();
            Print00000Controller.itemDes = txtDes.getText().trim();
            Print00000Controller.oldPrice = txtOldPrice.getText().trim();
            Print00000Controller.oldPricePoint = txtOldPoint.getText().trim();
            Print00000Controller.newPrice = txtnewPrice.getText().trim();
            Print00000Controller.newPricePoint = txtnewPricePoint.getText().trim();
            Print00000Controller.color = color;
            
            
            Parent p = FXMLLoader.load(getClass().getResource("Print00000.fxml"));
            root.getChildren().setAll(p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void cbxWhite(ActionEvent event) {
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
   
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
