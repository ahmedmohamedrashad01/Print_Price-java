
package print_a4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;


public class Select_ImageController implements Initializable {

    @FXML
    private AnchorPane root;

    @FXML
    private ImageView firstImage;

    @FXML
    private ImageView secondImage;

    @FXML
    private ImageView FourthImage;

    @FXML
    private ImageView fifthImage;

    @FXML
    private ImageView ThirdImage;

    DropShadow shadow = new DropShadow(25, Color.RED);
    
     @FXML
    void fEnter(MouseEvent event) {
        firstImage.setEffect(shadow);
    }

    @FXML
    void fexit(MouseEvent event) {
         firstImage.setEffect(null);
    }
    
    
    @FXML
    void sEnter(MouseEvent event) {
         secondImage.setEffect(shadow);
    }

    @FXML
    void sExit(MouseEvent event) {
        secondImage.setEffect(null);
    }

       @FXML
    void tEnter(MouseEvent event) {
         ThirdImage.setEffect(shadow);
    }

    @FXML
    void tExit(MouseEvent event) {
         ThirdImage.setEffect(null);
    }
    
   @FXML
    void foEnter(MouseEvent event) {
        FourthImage.setEffect(shadow);
    }

    @FXML
    void foExit(MouseEvent event) {
         FourthImage.setEffect(null);
    }
    
      @FXML
    void fifthEnter(MouseEvent event) {
        fifthImage.setEffect(shadow);
    }   

    @FXML
    void fifthExit(MouseEvent event) {
        fifthImage.setEffect(null);
    }

    
    @FXML
    void FourthImageAction(MouseEvent event) {
         try{
            Parent p = FXMLLoader.load(getClass().getResource("Select_Fourth.fxml"));
            root.getChildren().setAll(p);
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void ThirdImageAction(MouseEvent event) {
         try{
            Parent p = FXMLLoader.load(getClass().getResource("Select_Third.fxml"));
            root.getChildren().setAll(p);
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void fifthImageAction(MouseEvent event) {
          try{
            Parent p = FXMLLoader.load(getClass().getResource("Select_Fifth.fxml"));
            root.getChildren().setAll(p);
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void firstImageAction(MouseEvent event) {
         try{
            Parent p = FXMLLoader.load(getClass().getResource("Select.fxml"));
            root.getChildren().setAll(p);
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void secondImageAction(MouseEvent event) {
        try{
            Parent p = FXMLLoader.load(getClass().getResource("Select_Two.fxml"));
            root.getChildren().setAll(p);
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
    
    
}
